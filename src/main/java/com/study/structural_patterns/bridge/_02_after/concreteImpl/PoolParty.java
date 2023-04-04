package com.study.structural_patterns.bridge._02_after.concreteImpl;

import com.study.structural_patterns.bridge._02_after.implementation.Skin;

public class PoolParty implements Skin {
    @Override
    public String getName() {
        return "PoolParty";
    }
}
