package com.ctrip.demo.demo.guava;

import com.google.common.base.Splitter;

/**
 * @Author xiaowei.wu
 * @Date 2019/1/27 16:08
 */
public class SplitterTest {


    public static void main(String[] args) {
        String str = "博伊西机场,13099679,1,1781,博伊西,43.56926346,-116.2219315,{\"BD09\":[-116.2219315,43.56926346],\"WGS84\":[-116.2219315,43.56926346],\"GCJ02\":[-116.2219315,43.56926346]}|";
        Iterable<String> split = Splitter.on("|").omitEmptyStrings().trimResults().split(str);
        for (String s : split) {
            System.out.println(s);
        }
    }
}
