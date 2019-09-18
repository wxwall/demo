package com.ctrip.demo.demo.chain;

import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ChainBase;
import org.apache.commons.chain.impl.ContextBase;

/**
 * @Author xiaowei.wu
 * @Date 2019/2/14 11:02
 */
public class HlogServer extends ChainBase {

    HlogServer(){
        addCommand(new DownLoadData());
        addCommand(new ProcessData());
        addCommand(new UpLoadData());
    }

    public static void main(String[] args) throws Exception {
        HlogServer hlogServer = new HlogServer();
        Context context = new ContextBase();
        context.put("aa","bb");
        hlogServer.execute(context);
    }
}
