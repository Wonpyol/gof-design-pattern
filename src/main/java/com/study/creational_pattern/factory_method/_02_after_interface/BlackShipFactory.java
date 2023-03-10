package com.study.creational_pattern.factory_method._02_after_interface;

public class BlackShipFactory implements ShipFactory {
    @Override
    public Ship createShip(String name) {
        Ship ship = new Ship();
        ship.setName(name);
        ship.setLogo("black logo");
        ship.setColor("black");
        return ship;
    }
}
