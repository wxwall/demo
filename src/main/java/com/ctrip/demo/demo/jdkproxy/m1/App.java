package com.ctrip.demo.demo.jdkproxy.m1;

/**
 * @Author xiaowei.wu
 * @Date 2019/11/28 13:50
 */
public class App {


    public static void main(String[] args) {

        Task task = (Task) ProxyFactory.newInstance(new TaskImpl());
        task.setData("hello");

    }
}
