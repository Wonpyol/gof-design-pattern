package com.study.structural_patterns.bridge._01_before;


import com.study.structural_patterns.bridge._02_after.implementation.Skin;

public interface Champion extends Skin {

    void move();

    void skillQ();

    void skillW();

    void skillE();

    void skillR();

}
