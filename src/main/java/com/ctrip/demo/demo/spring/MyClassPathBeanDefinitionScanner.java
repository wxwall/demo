package com.ctrip.demo.demo.spring;

import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.util.Set;

/**
 * @Author xiaowei.wu
 * @Date 2019/1/24 14:23
 */
public class MyClassPathBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {
    public MyClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry) {
        super(registry,false);
    }


    protected void registerFilters() {
        addIncludeFilter(new AnnotationTypeFilter(MyAnnotation.class));
    }

    @Override
    protected Set<BeanDefinitionHolder> doScan(String... basePackages) {
        return super.doScan(basePackages);
    }
}
