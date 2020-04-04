package com.ctrip.demo.demo.desgin.commend2;

import lombok.AllArgsConstructor;

/**
 * @Author xiaowei.wu
 * @Date 2019/10/29 15:29
 */
@AllArgsConstructor
public class Box {

    Command command;


    public void pressButton(){
        command.execute();
    }
}
