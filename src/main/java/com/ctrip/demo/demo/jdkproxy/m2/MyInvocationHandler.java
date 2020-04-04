package com.ctrip.demo.demo.jdkproxy.m2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author xiaowei.wu
 * @Date 2019/12/4 10:40
 */
public class MyInvocationHandler implements InvocationHandler{

    MyIntf myIntf;

    public MyInvocationHandler(MyIntf myIntf) {
        this.myIntf = myIntf;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object invoke = method.invoke(this.myIntf, args);

        return invoke;
    }
}
