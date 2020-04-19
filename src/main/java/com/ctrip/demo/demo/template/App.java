package com.ctrip.demo.demo.template;

/**
 * @Author xiaowei.wu
 * @Date 2020/4/16 14:20
 */
public class App {


    public static void main(String[] args) {
        HibernateJdbcTemplate hibernateJdbcTemplate = new HibernateJdbcTemplate();
        hibernateJdbcTemplate.templateMethod(str ->  {
            System.out.println("call template:" + str);
            return null;
        });
    }
}
