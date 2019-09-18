package com.ctrip.demo.demo.java8;

import com.google.common.collect.Maps;
import javafx.beans.property.adapter.ReadOnlyJavaBeanBooleanProperty;

import java.util.Map;
import java.util.Objects;

/**
 * @Author xiaowei.wu
 * @Date 2019/3/12 11:17
 */
public class MapvalueToString {


    public static void main(String[] args) {
        Map<String,Object> map = Maps.newHashMap();
        map.put("key1","111");
        map.put("key2",222);

        map.forEach((k,v) -> doit(k,v));
    }

    private static void doit(Object k, Object v) {
    }

    public void doit(String k, Objects objects){

    }
}
