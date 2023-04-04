package com.study.creational_patterns.factory_method._03_java;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public String wonpyol() {
        return "hello wonpyol";
    }
}
