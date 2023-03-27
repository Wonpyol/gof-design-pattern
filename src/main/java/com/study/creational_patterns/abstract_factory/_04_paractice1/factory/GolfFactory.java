package com.study.creational_patterns.abstract_factory._04_paractice1.factory;

import com.study.creational_patterns.abstract_factory._04_paractice1.productA.GolfManager;
import com.study.creational_patterns.abstract_factory._04_paractice1.productA.Manager;
import com.study.creational_patterns.abstract_factory._04_paractice1.productB.GolfPlayer;
import com.study.creational_patterns.abstract_factory._04_paractice1.productB.Player;

public class GolfFactory implements StaffFactory {
    @Override
    public Manager createManager() {
        return new GolfManager();
    }

    @Override
    public Player createPlayer() {
        return new GolfPlayer();
    }

}
