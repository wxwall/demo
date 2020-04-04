package com.ctrip.demo.demo.athor.springutils;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.util.ClassUtils;

import java.lang.reflect.Method;

/**
 * @Author xiaowei.wu
 * @Date 2019/12/3 10:03
 */
public class ClassUtilsTest {

    public static void main(String[] args) {

        System.out.println(ClassUtils.getShortName(ClassUtils.class));
        System.out.println(ClassUtils.getPackageName(ClassUtilsTest.class));
        System.out.println(ClassUtils.getClassFileName(ClassUtilsTest.class));
        System.out.println(ClassUtils.getShortNameAsProperty(ClassUtilsTest.class));
        System.out.println(ClassUtils.getQualifiedName(ClassUtilsTest.class));
        try {
            Class<?> aClass = ClassUtils.forName(ClassUtils.getQualifiedName(String.class), ClassUtils.getDefaultClassLoader());
            Object o = aClass.newInstance();
            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        Method eating = ClassUtils.getMethod(Human.class, "eat", null);
        String qualifiedMethodName = ClassUtils.getQualifiedMethodName(eating);
        System.out.println(qualifiedMethodName);

        boolean b = ClassUtils.hasConstructor(Man.class, null);
        System.out.println(b);


        Class<?>[] allInterfaces = ClassUtils.getAllInterfaces(new FileSystemXmlApplicationContext());
        for (Class<?> allInterface : allInterfaces) {
            System.out.println(allInterface.getName());
        }

    }
}
