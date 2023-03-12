package com.study.creational_pattern.abstract_factory._01_before;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip(String name) {
        return new WhiteShip(name);
    }
}
