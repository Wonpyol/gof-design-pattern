package com.study.creational_pattern.abstract_factory._04_paractice1.factory;

import com.study.creational_pattern.abstract_factory._04_paractice1.productA.Manager;
import com.study.creational_pattern.abstract_factory._04_paractice1.productB.Player;

public interface StaffFactory {
    Manager createManager();
    Player createPlayer();
}
