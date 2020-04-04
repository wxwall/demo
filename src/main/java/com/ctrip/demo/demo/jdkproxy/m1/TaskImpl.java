package com.ctrip.demo.demo.jdkproxy.m1;

/**
 * @Author xiaowei.wu
 * @Date 2019/11/28 13:45
 */
public class TaskImpl implements Task {
    @Override
    public void setData(String data) {
        System.out.println("taskImpl setData");
    }

    @Override
    public int getCalData(int x) {
        return 0 * 10;
    }
}
