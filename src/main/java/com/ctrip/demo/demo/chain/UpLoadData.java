package com.ctrip.demo.demo.chain;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

/**
 * @Author xiaowei.wu
 * @Date 2019/2/14 11:05
 */
public class UpLoadData implements Command {
    @Override
    public boolean execute(Context context) throws Exception {
        System.out.println("upload data");
        return false;
    }
}
