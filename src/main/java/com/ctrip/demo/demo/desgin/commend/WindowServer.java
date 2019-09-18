package com.ctrip.demo.demo.desgin.commend;

/**
 * @Author xiaowei.wu
 * @Date 2019/9/12 14:14
 */
public class WindowServer implements Command {
    @Override
    public void execute(AbstractCommandContenxt contenxt) {
        System.out.println("windows server execute command");
        contenxt.startServer();
    }
}
