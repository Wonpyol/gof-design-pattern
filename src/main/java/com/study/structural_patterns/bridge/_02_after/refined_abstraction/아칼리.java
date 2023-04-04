package com.study.structural_patterns.bridge._02_after.refined_abstraction;

import com.study.structural_patterns.bridge._02_after.abstraction.DefaultChampion;
import com.study.structural_patterns.bridge._02_after.implementation.Skin;

public class 아칼리 extends DefaultChampion {

    public 아칼리(Skin skin) {
        super(skin, "아칼리");
    }
}
