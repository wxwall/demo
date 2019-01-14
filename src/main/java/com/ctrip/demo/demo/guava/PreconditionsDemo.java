package com.ctrip.demo.demo.guava;

import com.google.common.base.Preconditions;

/**
 * @Author xiaowei.wu
 * @Date 2018/12/24 14:22
 */
public class PreconditionsDemo {

    public static void main(String[] args) {
        PreconditionsDemo demo = new PreconditionsDemo();
        try{
            double sqrt = demo.sqrt(-1);
            System.out.println(sqrt);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public double sqrt(double input) throws IllegalArgumentException {
        Preconditions.checkArgument(input > 0.0,
                "Illegal Argument passed: Negative value %s.", input);
        return Math.sqrt(input);
    }

    public int sum(Integer a, Integer b){
        a = Preconditions.checkNotNull(a,
                "Illegal Argument passed: First parameter is Null.");
        b = Preconditions.checkNotNull(b,
                "Illegal Argument passed: Second parameter is Null.");
        return a+b;
    }

    public int getValue(int input){
        int[] data = {1,2,3,4,5};
        Preconditions.checkElementIndex(input,data.length,
                "Illegal Argument passed: Invalid index.");
        return 0;
    }
}
