package com.ctrip.demo.demo.athor.apacehcommon;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;

import javax.naming.ConfigurationException;

/**
 * @Author xiaowei.wu
 * @Date 2019/1/10 15:29
 */
public class PropertiesReload {

    private static PropertiesConfiguration config;

    static {
        //实例化一个PropertiesConfiguration
        try {
            config = new PropertiesConfiguration("authentication.properties");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
            e.printStackTrace();
        }
        //设置reload策略，这里用当文件被修改之后reload（默认5s中检测一次）
        config.setReloadingStrategy(new FileChangedReloadingStrategy());

    }

    public static synchronized String getProperty(String key) {
        return (String) config.getProperty(key);
    }

    public static void main(String[] args) throws InterruptedException {
        for (;;) {
            System.out.println(PropertiesReload.getProperty("key"));
            Thread.sleep(2000);
        }
    }
}
