package com.ctrip.demo.demo.hystrix;

import com.netflix.hystrix.*;

import java.util.concurrent.TimeUnit;

/**
 * @Author xiaowei.wu
 * @Date 2019/12/2 10:32
 */
public class HelloWorldHystrixCommand extends HystrixCommand <String>{


    private final String name;
    public HelloWorldHystrixCommand(String name) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("hystrixGroup"))
                .andCommandKey(HystrixCommandKey.Factory.asKey("hystrixCommandkey"))
                .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
                        .withExecutionTimeoutInMilliseconds(300)
                        .withCircuitBreakerEnabled(true)
                        .withCircuitBreakerSleepWindowInMilliseconds(5000)
                        .withCircuitBreakerErrorThresholdPercentage(30)
                )
                .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("hystrixThreadPoolKey"))
                .andThreadPoolPropertiesDefaults(HystrixThreadPoolProperties.Setter()
                        .withCoreSize(20)
                        .withMaximumSize(40)
                )
        );
        this.name = name;
    }


    @Override
    protected String run() {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //throw new RuntimeException("hello");
        return Thread.currentThread().getName() + ": Hello " + name;
    }


    @Override
    protected String getFallback() {
        return Thread.currentThread().getName() + "fallback";
        //return super.getFallback();
    }
}
