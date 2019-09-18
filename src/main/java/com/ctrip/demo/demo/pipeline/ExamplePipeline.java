package com.ctrip.demo.demo.pipeline;

/**
 * @Author xiaowei.wu
 * @Date 2019/6/19 21:36
 */
public class ExamplePipeline {
    public static class AdditionInput {
        public final int int1;
        public final int int2;

        public AdditionInput(int int1, int int2) {
            this.int1 = int1;
            this.int2 = int2;
        }
    }
    public static class AddIntegersStep implements Step<AdditionInput, Integer> {
        @Override
        public Integer process(AdditionInput input) {
            return input.int1 + input.int2;
        }
    }

    public static class IntToStringStep implements Step<Integer, Integer> {
        @Override
        public Integer process(Integer input) {
            return input;
        }
    }

    public static class GetMultipy implements Step<Integer, String> {
        @Override
        public String process(Integer input) {
            return input + "1";
        }
    }

    public static class FiveStep implements Step<String,Double>{
        @Override
        public Double process(String input) throws StepException {
            return new Double("0");
        }
    }

    public static class SexStep implements Step<Double,Integer>{
        @Override
        public Integer process(Double input) throws StepException {
            return 0;
        }
    }


    public static void main(String[] args) throws Step.StepException {
        Pipeline<AdditionInput, Integer> pipe = new Pipeline<>(new AddIntegersStep())
                .pipe(new IntToStringStep())
                .pipe(new GetMultipy())
                .pipe(new FiveStep())
                .pipe(new SexStep());
        System.out.println(pipe.execute(new AdditionInput(1, 3)));
    }
}