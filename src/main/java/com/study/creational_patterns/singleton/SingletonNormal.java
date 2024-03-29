package com.study.creational_patterns.singleton;

/**
 * private 생성자와 public static 메소드를 사용하는 방법
 */
public class SingletonNormal {
    private static SingletonNormal instance;

    private SingletonNormal() {
    }

    public static SingletonNormal getInstance() {
        if (instance == null) {
            instance = new SingletonNormal();
        }
        return instance;
    }

    public static void main(String[] args) {
        Thread task1 = new Run();
        task1.start();
        Thread task2 = new Run();
        task2.start();
        Thread task3 = new Run();
        task3.start();
    }

    static class Run extends Thread {
        @Override
        public void run() {
            while (true) {
                SingletonNormal instance = new SingletonNormal().getInstance();
                System.out.println("instance.getClass() = " + instance.getInstance());
            }

        }
    }

}
