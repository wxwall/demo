package com.ctrip.demo.demo.desgin.pipeline.impl;

import com.ctrip.demo.demo.desgin.pipeline.Step;

/**
 * @Author xiaowei.wu
 * @Date 2019/6/28 20:14
 */
public class StepTwo implements Step<Integer,Integer> {



    @Override
    public Integer execute(Integer input) {
        return input  + 200;
    }
}
