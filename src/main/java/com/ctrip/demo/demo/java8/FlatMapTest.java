package com.ctrip.demo.demo.java8;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author xiaowei.wu
 * @Date 2020/1/13 19:35
 */
public class FlatMapTest {


    public static void main(String[] args) {

        List<String> teamIndia = Arrays.asList("Virat", "Dhoni", "Jadeja");
        List<String> teamAustralia = Arrays.asList("Warner", "Watson", "Smith");

        List<List<String>> lists = Lists.newArrayList();
        lists.add(teamIndia);
        lists.add(teamAustralia);

        List<String> stringList = lists.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        for (String s : stringList) {
            System.out.println(s);
        }


    }
}
