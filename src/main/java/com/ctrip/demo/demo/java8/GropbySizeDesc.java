package com.ctrip.demo.demo.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  分组后排序
 * @Author xiaowei.wu
 * @Date 2018/12/12 11:30
 */
public class GropbySizeDesc {

    List<User> users = Arrays.asList(new User(20), new User(35), new User(20));

    List<User> groupedUsers = users.stream()
            .collect(Collectors.groupingBy(User::getAge)) //Map {20: [user{count:1, age:20}, user{count:1, age:20}]}, {35: [user{count:1, age:35}]
            .entrySet() //Map变为entry列表，方便继续Stream操作
            .stream().map(
                    (entry) -> new User(entry.getValue().size(), entry.getKey()))
            //根据Entry产生新的User，list的长度是新的Count，key值是age
            .sorted(Comparator.comparingInt(User::getAge)) //排序是为了方便后面验证结果
            .collect(Collectors.toList()); //从Stream变回list

}
