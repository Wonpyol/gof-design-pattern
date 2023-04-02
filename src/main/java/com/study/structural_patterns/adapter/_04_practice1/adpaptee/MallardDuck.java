package com.study.structural_patterns.adapter._04_practice1.adpaptee;

import com.study.structural_patterns.adapter._04_practice1.target.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Fly a long distance");

    }
}
