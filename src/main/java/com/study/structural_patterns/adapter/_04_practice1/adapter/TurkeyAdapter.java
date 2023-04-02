package com.study.structural_patterns.adapter._04_practice1.adapter;

import com.study.structural_patterns.adapter._04_practice1.target.Duck;
import com.study.structural_patterns.adapter._04_practice1.adpaptee.Turkey;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        //기능을 추가함
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
