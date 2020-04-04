package com.ctrip.demo.demo.desgin.adapter;

/**
 * @Author xiaowei.wu
 * @Date 2019/9/18 20:07
 */
public class Captain implements RowingBoat {

    RowingBoat rowingBoat;

    Captain(RowingBoat boat){
        this.rowingBoat = boat;
    }

    @Override
    public void row(){
        rowingBoat.row();
    }

}
