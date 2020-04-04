package com.ctrip.demo.demo.hystrix;

/**
 * @Author xiaowei.wu
 * @Date 2019/12/2 10:36
 */
public class App {

    public static void main(String[] args) {


            HelloWorldHystrixCommand command = new HelloWorldHystrixCommand("小明");
            Object execute = command.execute();
            System.out.println(execute);




    }
}
