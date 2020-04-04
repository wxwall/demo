package com.ctrip.demo.demo.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

/**
 * @Author xiaowei.wu
 * @Date 2019/10/24 14:10
 */
@Data
@Builder
@ToString
public class Person {


    private String name;

    private int age;

    private long distance;

    public void findName(@NonNull String name){
        System.out.println("name");
    }

}
