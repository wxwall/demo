package com.ctrip.demo.demo.spring.springautowrite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.GenericApplicationListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * @Author xiaowei.wu
 * @Date 2019/12/12 16:21
 */
@Component
public class MyApplicationContext implements ApplicationListener {

    @Autowired
    ConfigurableListableBeanFactory beanFactory;

    @Autowired



    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        BeanDefinition myApplicationContext = beanFactory.getBeanDefinition("myApplicationContext");
        System.out.println(myApplicationContext.getBeanClassName());

    }
}
