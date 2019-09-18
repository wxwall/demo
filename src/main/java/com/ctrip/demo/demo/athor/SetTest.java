package com.ctrip.demo.demo.athor;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author xiaowei.wu
 * @Date 2019/2/15 10:49
 */
public class SetTest {

    public static void main(String[] args) {
        List<String> es = Lists.newArrayList("11","22","33","11");
        Set set = Sets.newHashSet();
        Set<String> collect = es.stream().collect(Collectors.toSet());
        collect.stream().forEach(System.out::println);


        ArrayList<Integer> integers = Lists.newArrayList(1, 2, 3, 4);
        integers.stream().map(s -> s = s + 1).forEach(s -> System.out.println(s));

        Double collect1 = integers.stream().collect(Collectors.averagingInt(p -> p.intValue()));
        System.out.println(collect1);
    }

}
