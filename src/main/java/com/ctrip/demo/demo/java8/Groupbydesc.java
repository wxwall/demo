package com.ctrip.demo.demo.java8;

import com.google.common.collect.Lists;
import org.omg.PortableInterceptor.USER_EXCEPTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author xiaowei.wu
 * @Date 2019/2/19 10:26
 */
public class Groupbydesc {


    public static void main(String[] args) {

        descStrings();
        descUsers();
    }

    private static void descStrings() {
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println(result);
    }

    private static void descUsers(){
        ArrayList<Student> students = Lists.newArrayList(
                new Student("小明", 1),
                new Student("小明", 1),
                new Student("小强", 2));
        Map<String, Long> collect = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));
        System.out.println(collect);
    }


    static class Student{

        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
