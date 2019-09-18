package com.ctrip.demo.demo.java8.lambda;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * @Author xiaowei.wu
 * @Date 2019/6/3 15:17
 */
public class OptionFunction {
    public static void main(String[] args) {
        String aa = "11";
        Optional.ofNullable(aa).ifPresent(a ->{
            System.out.println(a);
        });


        Consumer consumer = s ->{
            System.out.println(s);
        };

        Optional.ofNullable(aa).ifPresent(consumer);




    }




}
