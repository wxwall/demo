package com.ctrip.demo.demo.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author xiaowei.wu
 * @Date 2019/10/28 17:28
 */
@Service
public class FactoryForStrategy {

    @Autowired
    Map<String,Strategy> strategys = new ConcurrentHashMap();

    public Strategy getStrategy(String name){
        Strategy strategy = strategys.get(name);
        return strategy;
    }
}
