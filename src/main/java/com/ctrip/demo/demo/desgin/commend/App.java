package com.ctrip.demo.demo.desgin.commend;

import com.ctrip.demo.demo.desgin.commend.command.StartNgx;

/**
 * @Author xiaowei.wu
 * @Date 2019/9/12 13:59
 */
public class App {


    public static void main(String[] args) {
        StartNgx ngx = new StartNgx();
        Command command = new WindowServer();
        command.execute(ngx);

    }


}
