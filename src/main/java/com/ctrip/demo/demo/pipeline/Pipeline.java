package com.ctrip.demo.demo.pipeline;

/**
 * @Author xiaowei.wu
 * @Date 2019/6/19 21:37
 */
public class Pipeline<I, O> {
    private final Step<I, O> current;
    public Pipeline(Step<I, O> current) {
        this.current = current;
    }

    public <NewO> Pipeline<I, NewO> pipe(Step<O, NewO> next) {
        return new Pipeline<>(input -> next.process(current.process(input)));
    }

    public O execute(I input) throws Step.StepException {
        return current.process(input);
    }
}
