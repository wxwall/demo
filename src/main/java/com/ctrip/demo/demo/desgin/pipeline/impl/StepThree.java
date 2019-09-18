package com.ctrip.demo.demo.desgin.pipeline.impl;

import com.ctrip.demo.demo.desgin.pipeline.Step;

/**
 * @Author xiaowei.wu
 * @Date 2019/6/28 20:15
 */
public class StepThree implements Step<Integer,String> {



    @Override
    public String execute(Integer input) {
        String s = "result:" + input;
        System.out.println(s);
        return s;
    }
}
