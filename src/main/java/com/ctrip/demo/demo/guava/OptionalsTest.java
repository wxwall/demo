package com.ctrip.demo.demo.guava;

import java.util.Optional;

/**
 * @Author xiaowei.wu
 * @Date 2019/1/31 13:15
 */
public class OptionalsTest {

    public static void main(String[] args, Integer aa) {
        String test = Optional.ofNullable(null).orElse("11").toString();
        Integer integer = Optional.ofNullable(aa).orElse(11);
        Integer integer1 = integer;
        System.out.println(integer1);
    }
}
