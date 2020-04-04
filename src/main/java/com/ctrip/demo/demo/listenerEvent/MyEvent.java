package com.ctrip.demo.demo.listenerEvent;

import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * @Author xiaowei.wu
 * @Date 2019/10/22 19:55
 */
@Data
public class MyEvent extends ApplicationContextEvent {

    private String aa;

    public MyEvent(ApplicationContext source) {
        super(source);
    }
}
