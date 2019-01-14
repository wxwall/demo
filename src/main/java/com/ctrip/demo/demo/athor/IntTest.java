package com.ctrip.demo.demo.athor;

/**
 * @Author xiaowei.wu
 * @Date 2018/12/26 10:06
 */
public class IntTest {


    public static void main(String[] args) {
        IntTest test = new IntTest();
        test.start();
    }

    public void start(){
        Integer i = new Integer("0");
        change(i);
        System.out.println(i);
    }

    public void change(int t){
        if(t == 5){
            return;
        }
        else {
            t ++;
            change(t);
        }
    }
}
