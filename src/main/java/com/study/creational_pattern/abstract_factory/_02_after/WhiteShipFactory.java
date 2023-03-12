package com.study.creational_pattern.abstract_factory._02_after;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip(String name) {
        return new WhiteShip(name);
    }
}
