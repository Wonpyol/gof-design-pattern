package com.study.creational_patterns.factory_method._02_after;

public class BlackShipFactory implements ShipFactory{
    @Override
    public Ship createShip(String name) {
        return new BlackShip(name);
    }
}
