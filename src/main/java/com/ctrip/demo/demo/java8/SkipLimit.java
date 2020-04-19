package com.ctrip.demo.demo.java8;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author xiaowei.wu
 * @Date 2020/3/30 12:18
 */
public class SkipLimit {

    public static void main(String[] args) {

        ArrayList<String> strings = Lists.newArrayList();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("6");

        List<String> collect = strings.stream().skip(6).limit(4).collect(Collectors.toList());
        for (String s : collect) {
            System.out.println(s);
        }




    }
}
