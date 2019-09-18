package com.ctrip.demo.demo.desgin.pipeline;

import com.ctrip.demo.demo.desgin.pipeline.impl.StepOne;
import com.ctrip.demo.demo.desgin.pipeline.impl.StepThree;
import com.ctrip.demo.demo.desgin.pipeline.impl.StepTwo;

/**
 * @Author xiaowei.wu
 * @Date 2019/6/28 20:17
 */
public class App {


    public static void main(String[] args) {
        Pipeline pipeline = new Pipeline();
        pipeline.addStep(new StepOne());
        pipeline.addStep(new StepTwo());
        pipeline.addStep(new StepThree());

        pipeline.execute();
    }
}
