package com.ctrip.demo.demo.jdkproxy.m1;

import java.lang.reflect.Proxy;

/**
 * @Author xiaowei.wu
 * @Date 2019/11/28 13:47
 */
public class ProxyFactory {



    public static Object newInstance(Object object){
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),new Class<?>[]{Task.class}, new MyInvokationHandler());
    }
}
