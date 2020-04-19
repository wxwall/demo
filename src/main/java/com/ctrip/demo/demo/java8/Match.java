package com.ctrip.demo.demo.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @Author xiaowei.wu
 * @Date 2020/4/8 11:03
 */
public class Match {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("11000", "12000", "13000");
        String s1 = strings.stream().filter(s -> s.equals("11000")).findAny().get();
        System.out.println(s1);
    }
}
