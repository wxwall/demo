package com.ctrip.demo.demo.template;

/**
 * @Author xiaowei.wu
 * @Date 2020/4/16 14:17
 */
public abstract class JdbcTemplate {

    public void templateMethod(StatementCallback callback){
        method();
        method2();
        String metho3 = method3();
        callback.doinstance(metho3);
    }

    private void method(){
        System.out.println("this is method");
    }

    public void method2(){
        System.out.println("this is method2");
    }

    public abstract String method3();
}
