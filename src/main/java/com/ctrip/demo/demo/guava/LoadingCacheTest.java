package com.ctrip.demo.demo.guava;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.base.MoreObjects;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

/**
 * @Author xiaowei.wu
 * @Date 2018/12/24 16:31
 */
public class LoadingCacheTest {
    public static void main(String args[]){
        //create a cache for employees based on their employee id
        LoadingCache employeeCache =
                CacheBuilder.newBuilder()
                        .maximumSize(100)
                        .expireAfterAccess(30, TimeUnit.MINUTES)
                        .build(new CacheLoader(){
                            @Override
                            public Object load(Object o) throws Exception {
                                return getFromDatabase(o);
                            } // build the cacheloader

                        });

        try {
            //on first invocation, cache will be populated with corresponding
            //employee record
            System.out.println("Invocation #1");
            System.out.println(employeeCache.get("100"));
            System.out.println(employeeCache.get("103"));
            System.out.println(employeeCache.get("110"));
            //second invocation, data will be returned from cache
            System.out.println("Invocation #2");
            System.out.println(employeeCache.get("100"));
            System.out.println(employeeCache.get("103"));
            System.out.println(employeeCache.get("110"));

            System.out.println(employeeCache.stats().toString());

        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static Object getFromDatabase(Object empId){
        Employee e1 = new Employee("Mahesh", "Finance", "100");
        Employee e2 = new Employee("Rohan", "IT", "103");
        Employee e3 = new Employee("Sohan", "Admin", "110");

        Map database = new HashMap();
        database.put("100", e1);
        database.put("103", e2);
        database.put("110", e3);
        Object o = database.get(empId);
        return o;
    }
}
class Employee {
    String name;
    String dept;
    String emplD;

    public Employee(String name, String dept, String empID){
        this.name = name;
        this.dept = dept;
        this.emplD = empID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getEmplD() {
        return emplD;
    }
    public void setEmplD(String emplD) {
        this.emplD = emplD;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(Employee.class)
                .add("Name", name)
                .add("Department", dept)
                .add("Emp Id", emplD).toString();
    }
}