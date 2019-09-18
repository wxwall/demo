package com.ctrip.demo.demo.guava;

import com.google.common.net.UrlEscapers;

/**
 * @Author xiaowei.wu
 * @Date 2019/1/23 16:55
 */
public class EscaperTest {

    public static void main(String[] args) {
        String str="http://www.baidu.com/api/?action=s2s_install&a={appsunion}&b=3&c=300294cf2fb33ab47691cde6fed03836";
        str = UrlEscapers.urlFragmentEscaper().escape(str);
        System.out.println("*********" + str);
    }
}
