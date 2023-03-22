package com.study.creational_pattern.singleton;


public class SingletonHolder {
    private SingletonHolder() {}

    public static class CreateHolder {
        private static final SingletonHolder INSTANCE = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return CreateHolder.INSTANCE;
    }
    public static void main(String[] args) {

        SingletonHolder instance = SingletonHolder.getInstance();
        System.out.println("instance = " + instance);

        SingletonHolder instance1 = SingletonHolder.getInstance();
        System.out.println("instance1 = " + instance1);

        SingletonHolder instance2 = SingletonHolder.getInstance();
        System.out.println("instance2 = " + instance2);
    }
}