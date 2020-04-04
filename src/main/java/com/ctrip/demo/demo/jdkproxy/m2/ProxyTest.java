package com.ctrip.demo.demo.jdkproxy.m2;

import java.lang.reflect.Proxy;

/**
 * @Author xiaowei.wu
 * @Date 2019/12/4 10:41
 */
public class ProxyTest {


    public static void main(String[] args) {
        MyIntf myIntfImpl = new MyIntfImpl();
        MyIntf myIntf = (MyIntf) Proxy.newProxyInstance(MyIntf.class.getClassLoader(), new Class[]{MyIntf.class}, new MyInvocationHandler(myIntfImpl));
        myIntf.helloWorld();
        myIntf.hello("小明");

    }
}
