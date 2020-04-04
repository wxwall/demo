package com.ctrip.demo.demo.desgin.adapter;

/**
 * @Author xiaowei.wu
 * @Date 2019/9/18 20:16
 */
public class FishingBoatAdapter implements RowingBoat {

    FishingBoat fishingBoat = new FishingBoat();

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
