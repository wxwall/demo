package com.ctrip.demo.demo.spring.beanpostprocessor;

import com.ctrip.demo.demo.spring.MyAnnotation;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Objects;

/**
 * @Author xiaowei.wu
 * @Date 2019/12/5 13:19
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {


    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        MyAnnotation annotation = bean.getClass().getAnnotation(MyAnnotation.class);
        if(Objects.nonNull(annotation)){
            Field[] fields = bean.getClass().getDeclaredFields();
            for (Field field : fields) {
                Class<?> type = field.getType();
                System.out.println(type);

                ProxyFactory proxyFactory = new ProxyFactory();
                proxyFactory.setInterfaces(type);
                proxyFactory.addAdvice(new MyAdvice());
                Object proxy = proxyFactory.getProxy();
                try {
                    field.set(bean,proxy);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

        }

        return bean;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
