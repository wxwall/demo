package com.ctrip.demo.demo.desgin.commend2.impl;

import com.ctrip.demo.demo.desgin.commend2.MainBord;

/**
 * @Author xiaowei.wu
 * @Date 2019/10/29 15:15
 */
public class JijiaMainbord implements MainBord {


    @Override
    public void open() {
        System.out.println("技嘉主板开机。。。");
    }

    @Override
    public void close() {
        System.out.println("技嘉主板关机。。。");
    }

    @Override
    public void reset() {
        System.out.println("技嘉重启....");
        this.close();
        this.open();
    }
}
