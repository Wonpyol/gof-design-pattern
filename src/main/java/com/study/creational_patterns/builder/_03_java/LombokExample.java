package com.study.creational_patterns.builder._03_java;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LombokExample {
    private String title;
    private String version;

    public static void main(String[] args) {
        LombokExample lombok = LombokExample.builder().title("롬복").version("1.8").build();
        System.out.println("lombok = " + lombok);
    }

}
