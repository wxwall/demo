package com.ctrip.demo.demo.desgin.commend.command;

import com.ctrip.demo.demo.desgin.commend.AbstractCommandContenxt;

/**
 * @Author xiaowei.wu
 * @Date 2019/9/12 14:12
 */
public class StartNgx extends AbstractCommandContenxt {
    @Override
    public void startServer() {
        System.out.println("start ngx ...");
    }

    @Override
    public void closeServer() {
        System.out.println("stop ngx ...");
    }
}
