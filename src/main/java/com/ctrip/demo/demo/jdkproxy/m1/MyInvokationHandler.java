package com.ctrip.demo.demo.jdkproxy.m1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author xiaowei.wu
 * @Date 2019/11/28 13:46
 */
public class MyInvokationHandler implements InvocationHandler {


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        if(method.getName().contains("get")){
            System.out.println("...get Method Executing...");
        }else{
            System.out.println("...set Method Executing...");
        }
        result = method.invoke(proxy, args);
        return result;
    }
}
