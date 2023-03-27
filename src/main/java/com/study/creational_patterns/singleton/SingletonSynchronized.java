package com.study.creational_patterns.singleton;

/**
 * synchronized 사용해서 동기화 처리
 */
public class SingletonSynchronized {
    public static SingletonSynchronized instance;
    private SingletonSynchronized() {
    }

    public synchronized SingletonSynchronized getInstance() { //메소드 락걸기
        if (instance == null) {
            instance = new SingletonSynchronized();
        }
        return instance;
    }
}
