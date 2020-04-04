package com.ctrip.demo.demo.desgin.adapter;

/**
 * @Author xiaowei.wu
 * @Date 2019/9/18 20:06
 */
public class App {

    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
