package com.ctrip.demo.demo.listenerEvent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author xiaowei.wu
 * @Date 2019/10/22 19:49
 */
@Slf4j
@Component
public class MyEventListener implements ApplicationListener {


    @org.springframework.context.event.EventListener
    public void doEventListener(ApplicationEvent event){
        if(event instanceof MyEvent){
            System.out.println("hello myEvent");
        }
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event);
    }
}
