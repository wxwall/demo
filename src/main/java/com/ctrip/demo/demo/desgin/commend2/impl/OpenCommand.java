package com.ctrip.demo.demo.desgin.commend2.impl;

import com.ctrip.demo.demo.desgin.commend2.Command;
import com.ctrip.demo.demo.desgin.commend2.MainBord;
import com.ctrip.demo.demo.desgin.commend2.impl.JijiaMainbord;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @Author xiaowei.wu
 * @Date 2019/10/29 14:44
 */
@AllArgsConstructor
@NoArgsConstructor
public class OpenCommand implements Command {

    private MainBord mainBord;



    @Override
    public void execute() {
        if(Objects.isNull(mainBord)){
            mainBord = new JijiaMainbord();
        }
        mainBord.open();
    }
}
