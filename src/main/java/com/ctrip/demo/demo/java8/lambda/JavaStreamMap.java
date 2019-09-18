package com.ctrip.demo.demo.java8.lambda;

import com.ctrip.demo.demo.java8.User;
import com.google.common.collect.Lists;

import javax.jnlp.UnavailableServiceException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author xiaowei.wu
 * @Date 2019/6/11 10:13
 */
public class JavaStreamMap {

    public static void main(String[] args) {

        List<User> list  = Lists.newArrayList();
        for (int i = 0; i < 5; i ++){
            User u = new User(1,2);
            list.add(u);
        }

        List<Integer> integers = list.stream().map(user -> {
            return user.getAge();
        }).collect(Collectors.toList());

        System.out.println(integers);
    }
}
