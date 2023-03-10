package com.study.creational_pattern.singleton;

public enum Setting4 {
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
        Setting4 instance = Setting4.INSTANCE;
        System.out.println("instance.getValue() = " + instance.getValue());
        instance.setValue(2);
        Setting4 instance1 = Setting4.INSTANCE;
        System.out.println("instance.getValue() = " + instance.getValue());
    }
}