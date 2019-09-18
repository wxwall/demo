package com.ctrip.demo.demo.commons;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 * @Author xiaowei.wu
 * @Date 2019/6/10 9:56
 */
public class ReflectionToStringBuilderTest {


    public static void main(String[] args) {
        ReflectionToStringBuilderTest test = new ReflectionToStringBuilderTest();
        test.setAa(11);
        test.setBb("1212");
        System.out.println(test.toString());
    }

    private int aa;
    private String bb;

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
