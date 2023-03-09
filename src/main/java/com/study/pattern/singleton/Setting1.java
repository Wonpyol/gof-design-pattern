package com.study.pattern.singleton;

/**
 * private 생성자와 public static 메소드를 사용하는 방법
 */
public class Setting1 {
    private static Setting1 instance;

    private Setting1() {
    }

    public static Setting1 getInstance() {
        if (instance == null) {
            instance = new Setting1();
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
                Setting1 instance = new Setting1().getInstance();
                System.out.println("instance.getClass() = " + instance.getInstance());
            }

        }
    }

}
