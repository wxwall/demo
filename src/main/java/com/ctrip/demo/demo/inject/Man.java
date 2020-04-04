package com.ctrip.demo.demo.inject;

import org.springframework.stereotype.Component;

import javax.inject.Singleton;

/**
 * @Author xiaowei.wu
 * @Date 2019/12/9 11:03
 */
@Component
public class Man implements Human {
    @Override
    public void eat() {
        System.out.println("man eating");
    }
}
