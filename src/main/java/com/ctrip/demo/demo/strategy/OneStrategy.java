package com.ctrip.demo.demo.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author xiaowei.wu
 * @Date 2019/10/28 17:27
 */
@Component
@Slf4j
public class OneStrategy implements Strategy {
    @Override
    public void opration() {
        log.info("opration 1 run");
    }
}
