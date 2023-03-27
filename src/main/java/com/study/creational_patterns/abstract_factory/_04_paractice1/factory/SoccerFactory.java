package com.study.creational_patterns.abstract_factory._04_paractice1.factory;

import com.study.creational_patterns.abstract_factory._04_paractice1.productA.Manager;
import com.study.creational_patterns.abstract_factory._04_paractice1.productA.SoccerManager;
import com.study.creational_patterns.abstract_factory._04_paractice1.productB.Player;
import com.study.creational_patterns.abstract_factory._04_paractice1.productB.SoccerPlayer;

public class SoccerFactory implements StaffFactory {

    @Override
    public Manager createManager() {
        return new SoccerManager();
    }

    @Override
    public Player createPlayer() {
        return new SoccerPlayer();
    }
}
