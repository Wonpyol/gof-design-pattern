package com.study.pattern.singleton;

/**
 * synchronized 사용해서 동기화 처리
 */
public class Setting2 {
    public static Setting2 instance;
    private Setting2() {
    }

    public synchronized Setting2 getInstance() { //메소드 락걸기
        if (instance == null) {
            instance = new Setting2();
        }
        return instance;
    }
}
