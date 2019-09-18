package com.ctrip.demo.demo.chain;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

/**
 * @Author xiaowei.wu
 * @Date 2019/2/14 11:02
 */
public class DownLoadData implements Command {


    @Override
    public boolean execute(Context context) throws Exception {
        System.out.println("DownLoadData");
        System.out.println(context.get("aa"));
        return false;
    }
}
