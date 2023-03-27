package com.study.creational_patterns.singleton;

public enum SingletonEnum {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Test {
    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        System.out.println("instance.getValue() = " + instance.getValue());
        instance.setValue(2);
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        System.out.println("instance.getValue() = " + instance.getValue());
    }
}