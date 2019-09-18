package com.ctrip.demo.demo.desgin.pipeline;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xiaowei.wu
 * @Date 2019/6/28 20:15
 */
public class Pipeline {

    private List<Step> pipelineSteps = new ArrayList<>();

    private Object firstStepInput = 100;

    public void addStep(Step step) {
        pipelineSteps.add(step);
    }

    public void execute() {
        for (Step step : pipelineSteps) {
            Object out = step.execute(firstStepInput);
            firstStepInput = out;
        }
    }
}
