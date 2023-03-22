package com.study.creational_pattern.builder._03_java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SprimgExample {
    public static void main(String[] args) {
        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("wonpyol.com")
                .path("/builder")
                .build().encode();
        System.out.println("uri.toUriString() = " + uri.toUriString());
    }
}

