package com.ctrip.demo.demo.desgin.commend.command;

import com.ctrip.demo.demo.desgin.commend.AbstractCommandContenxt;

/**
 * @Author xiaowei.wu
 * @Date 2019/9/12 14:11
 */
public class StartTomcat extends AbstractCommandContenxt {

    @Override
    public void startServer() {
        System.out.println("start tomcat ....");
    }
}
