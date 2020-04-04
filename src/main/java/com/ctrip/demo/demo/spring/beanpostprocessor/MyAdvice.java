package com.ctrip.demo.demo.spring.beanpostprocessor;

import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Author xiaowei.wu
 * @Date 2019/12/5 13:55
 */
public class MyAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object invoke = methodInvocation.getMethod().invoke(methodInvocation.getArguments());
        return invoke;
    }
}
