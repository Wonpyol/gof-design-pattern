package com.study.creational_patterns.factory_method._03_java;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanFactoryExample {
    public static void main(String[] args) {
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = beanFactory.getBean("hello", String.class);
        System.out.println("hello = " + hello);
    }
}
