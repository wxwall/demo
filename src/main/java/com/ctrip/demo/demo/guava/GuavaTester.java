package com.ctrip.demo.demo.guava;


import com.google.common.base.Optional;

/**
 * @Author xiaowei.wu
 * @Date 2018/12/24 14:01
 */
public class GuavaTester {
    public static void main(String args[]){
        GuavaTester guavaTester = new GuavaTester();
        Integer value1 =  null;
        Integer value2 =  new Integer(10);
        Optional<Integer> a = Optional.fromNullable(value1);
        Optional<Integer> b = Optional.of(value2);
        System.out.println(guavaTester.sum(a,b));


        String nullStr = null;
        Optional<String> str = Optional.fromNullable(nullStr);

        if(!str.isPresent()){
            String s = str.or(new String("没有则添加"));
            System.out.println(s);
        }
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b){
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());
        Integer value1 = a.or(new Integer(0));
        Integer value2 = b.get();
        return value1 + value2;
    }
}