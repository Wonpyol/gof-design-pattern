package com.study.creational_patterns.abstract_factory._03_java;

import com.study.creational_patterns.abstract_factory._02_after.Ship;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {
    @Override
    public Ship getObject() throws Exception {
        Ship ship = new Ship();
        ship.setName("wonpyol");
        return ship;

    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
