package com.ctrip.demo.demo.desgin.commend2;

import com.ctrip.demo.demo.desgin.commend2.impl.JijiaMainbord;
import com.ctrip.demo.demo.desgin.commend2.impl.RestartCommand;

/**
 * @Author xiaowei.wu
 * @Date 2019/10/29 14:47
 */
public class Client {



    public static void main(String args[]){
        MainBord mainBord = new JijiaMainbord();
        Command command = new RestartCommand(mainBord);
        Box box = new Box(command);
        box.pressButton();
    }
}
