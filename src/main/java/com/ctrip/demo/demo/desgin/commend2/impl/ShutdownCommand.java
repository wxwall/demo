package com.ctrip.demo.demo.desgin.commend2.impl;


import com.ctrip.demo.demo.desgin.commend2.Command;
import com.ctrip.demo.demo.desgin.commend2.MainBord;
import lombok.AllArgsConstructor;

/**
 * @Author xiaowei.wu
 * @Date 2019/10/29 15:55
 */
@AllArgsConstructor
public class ShutdownCommand implements Command {

    MainBord mainBord;


    @Override
    public void execute() {
        mainBord.close();
    }
}
