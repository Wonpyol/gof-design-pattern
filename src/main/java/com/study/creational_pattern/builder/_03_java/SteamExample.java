package com.study.creational_pattern.builder._03_java;

import java.util.stream.Stream;

public class SteamExample {
    public static void main(String[] args) {
        Stream<Object> names = Stream.builder().add("lee").add("wonpyol").build();
        names.forEach(System.out::println);
    }
}
