package com.ctrip.demo.demo.pipeline;

/**
 * @Author xiaowei.wu
 * @Date 2019/6/19 21:38
 */
@FunctionalInterface
public interface Step<I, O> {
    class StepException extends Throwable {
        public StepException(Throwable t) {
            super(t);
        }
    }
    O process(I input) throws StepException;
}