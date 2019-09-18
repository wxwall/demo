package com.ctrip.demo.demo.hutool;

import cn.hutool.core.convert.Convert;
import cn.hutool.system.JvmInfo;
import cn.hutool.system.JvmSpecInfo;
import cn.hutool.system.SystemUtil;

import java.util.concurrent.TimeUnit;

/**
 * @Author xiaowei.wu
 * @Date 2019/4/17 10:49
 */
public class ConventDemo {

    public static void main(String[] args) {
        long a = 4535345;
        long minutes = Convert.convertTime(a, TimeUnit.MILLISECONDS, TimeUnit.MINUTES);

        System.out.println(SystemUtil.getRuntimeInfo());
    }
}
