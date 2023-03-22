package com.study.creational_pattern.abstract_factory._03_java;


import com.study.creational_pattern.abstract_factory._02_after.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {
    @Bean
    public ShipFactory shipFactory() {
        return new ShipFactory();
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        Ship ship = applicationContext.getBean(Ship.class);
        System.out.println("ship = " + ship);
    }
}
