package com.study.creational_pattern.singleton.java;

public class RuntimeExample {
    public static void main(String[] args) {
        Runtime runtime1 = Runtime.getRuntime();
        System.out.println("runtime1 = " + runtime1);
        Runtime runtime2 = Runtime.getRuntime();
        System.out.println("runtime2 = " + runtime2);
        Runtime runtime3 = Runtime.getRuntime();
        System.out.println("runtime3 = " + runtime3);
    }
}
