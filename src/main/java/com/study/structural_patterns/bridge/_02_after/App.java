package com.study.structural_patterns.bridge._02_after;

import com.study.structural_patterns.bridge._02_after.abstraction.Champion;
import com.study.structural_patterns.bridge._02_after.refined_abstraction.아리;
import com.study.structural_patterns.bridge._02_after.concreteImpl.KDA;
import com.study.structural_patterns.bridge._02_after.concreteImpl.PoolParty;
import com.study.structural_patterns.bridge._02_after.refined_abstraction.아칼리;

public class App {

    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillR();
        poolParty아리.skillW();

        Champion kda아카리 = new 아칼리(new KDA());
        kda아카리.skillQ();
        kda아카리.skillW();
    }
}
