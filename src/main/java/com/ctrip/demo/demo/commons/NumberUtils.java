package com.ctrip.demo.demo.commons;

/**
 * @Author xiaowei.wu
 * @Date 2019/12/25 10:14
 */
public class NumberUtils {


    public static void main(String[] args) {
        int i = org.apache.commons.lang.math.NumberUtils.toInt("null", 1);
        int i3 = org.apache.commons.lang.math.NumberUtils.toInt("3", 1);
        boolean number = org.apache.commons.lang.math.NumberUtils.isNumber("3");
        System.out.println(number);
        System.out.println(i3);
        System.out.println(i);
    }
}
