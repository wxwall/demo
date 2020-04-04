package com.ctrip.demo.demo.inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManTest {

    @Inject
    Human human;


    @Test
    public void eat() throws Exception {

        human.eat();
    }

}