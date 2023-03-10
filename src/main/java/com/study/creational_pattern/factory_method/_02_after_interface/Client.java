package com.study.creational_pattern.factory_method._02_after_interface;

public class Client {

    private ShipFactory shipFactory;

    public static void main(String[] args) {

        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "keesun@mail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "keesun@mail.com");
        System.out.println(blackship);
    }

    private ShipFactory createFactory(ShipFactory shipFactory) {
        return this.shipFactory = shipFactory;
    }

}
