package com.study.creational_pattern.factory_method._02_after_interface;

public class BlackShipFactory implements ShipFactory {
    @Override
    public BlackShip createShip(String name) {
        return new BlackShip(name);

    }
}
