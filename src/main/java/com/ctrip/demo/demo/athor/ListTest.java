package com.ctrip.demo.demo.athor;

import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xiaowei.wu
 * @Date 2019/1/2 17:54
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        List<String> list2 = new ArrayList();
        list2.add("aa");
        Iterables.removeIf(list, str -> list2.contains(str));
        for (String s : list) {
            System.out.println(s);
        }


        String aa = new String("1.1");
        int i = 0;
        double a = Double.parseDouble(aa);
        if(i < a){
            System.out.println(true);
        }
    }
}
