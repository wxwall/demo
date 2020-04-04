package com.ctrip.demo.demo.guava;

import com.google.common.util.concurrent.RateLimiter;

/**
 * @Author xiaowei.wu
 * @Date 2019/12/5 19:47
 */
public class RateLimiterTest {


    static RateLimiter rateLimiter = RateLimiter.create(100);


    public static void main(String[] args) {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(rateLimiter.getRate());

        long l = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            rateLimiter.acquire(1);
            System.out.println("hello :" + i);
        }
        System.out.println("currentTime:" + (System.currentTimeMillis() - l));
    }

}
