package com.study.creational_pattern.factory_method._02_after_java8;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip(String name) {
        return new WhiteShip(name);
    }
}
