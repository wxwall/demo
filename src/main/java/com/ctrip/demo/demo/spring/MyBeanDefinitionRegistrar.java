package com.ctrip.demo.demo.spring;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author xiaowei.wu
 * @Date 2019/1/24 10:56
 */
public class MyBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        MyClassPathBeanDefinitionScanner scanner = new MyClassPathBeanDefinitionScanner(beanDefinitionRegistry);
        scanner.registerFilters();
        scanner.doScan("com.ctrip.demo.demo.spring");
    }
}
