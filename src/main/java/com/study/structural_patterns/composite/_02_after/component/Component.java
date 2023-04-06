package com.study.structural_patterns.composite._02_after.component;

/**
 * client 에서 사용 될 공통된 오퍼레이션
 * 가능한 추상적인 타입을 쓰는것이 좋음
 */
public interface Component {
    int getPrice();
}
