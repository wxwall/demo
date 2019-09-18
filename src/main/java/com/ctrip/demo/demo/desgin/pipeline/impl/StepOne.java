package com.ctrip.demo.demo.desgin.pipeline.impl;

import com.ctrip.demo.demo.desgin.pipeline.Step;

/**
 * @Author xiaowei.wu
 * @Date 2019/6/28 20:13
 */
public class StepOne implements Step<Integer,Integer> {

    @Override
    public Integer execute(Integer input) {
        return input + 100;
    }
}
