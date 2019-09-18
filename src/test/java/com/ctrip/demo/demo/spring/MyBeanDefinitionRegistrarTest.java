package com.ctrip.demo.demo.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBeanDefinitionRegistrarTest {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyBean myBean;

    @Test
    public void registerBeanDefinitions() throws Exception {
        System.out.println(myBean.getClass());
    }

}