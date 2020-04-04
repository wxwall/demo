package com.ctrip.demo.demo.desgin.commend2.impl;

import com.ctrip.demo.demo.desgin.commend2.MainBord;

/**
 * @Author xiaowei.wu
 * @Date 2019/10/29 15:16
 */
public class WeixingMainbord implements MainBord {


    @Override
    public void open() {
        System.out.println("微星开机。。。");
    }

    @Override
    public void close() {
        System.out.println("微星关机。。。。");
    }

    @Override
    public void reset() {
        System.out.println("微星重启....");
        this.close();
        this.open();
    }
}
