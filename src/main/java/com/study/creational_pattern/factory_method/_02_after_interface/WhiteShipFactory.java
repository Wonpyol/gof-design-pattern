package com.study.creational_pattern.factory_method._02_after_interface;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip(String name) {
        Ship ship = new Ship();
        ship.setName(name);
        ship.setLogo("white logo");
        ship.setColor("white");
        return ship;
    }
}
