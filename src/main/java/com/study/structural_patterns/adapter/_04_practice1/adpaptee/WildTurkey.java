package com.study.structural_patterns.adapter._04_practice1.adpaptee;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble");
    }

    @Override
    public void fly() {
        System.out.println("Flying a short distance");

    }
}
