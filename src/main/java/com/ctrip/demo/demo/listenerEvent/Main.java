package com.ctrip.demo.demo.listenerEvent;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author xiaowei.wu
 * @Date 2019/10/22 19:41
 */
@Configuration
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class Main {

    @Autowired
    ApplicationContext applicationContext;

    @Bean
    public void publishEvent(){
        MyEvent myEvent = new MyEvent(applicationContext);
        myEvent.setAa("hello");
        applicationContext.publishEvent("hello");
    }

}
