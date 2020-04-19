package com.ctrip.demo.demo.template;

/**
 * @Author xiaowei.wu
 * @Date 2020/4/16 14:19
 */
public class HibernateJdbcTemplate extends JdbcTemplate {


    @Override
    public String method3() {
        return "this is HibernateJdbcTemplate method3";
    }
}
