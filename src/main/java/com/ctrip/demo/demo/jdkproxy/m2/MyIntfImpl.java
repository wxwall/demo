package com.ctrip.demo.demo.jdkproxy.m2;

/**
 * @Author xiaowei.wu
 * @Date 2019/12/4 10:44
 */
public class MyIntfImpl implements MyIntf {
    @Override
    public void helloWorld() {
        System.out.println("hello myintfimpl");
    }

    @Override
    public void hello(String name) {
        System.out.println("hello " + name);
    }
}
