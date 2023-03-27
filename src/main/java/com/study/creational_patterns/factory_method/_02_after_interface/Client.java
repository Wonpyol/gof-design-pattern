package com.study.creational_patterns.factory_method._02_after_interface;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.createFactory(new WhiteShipFactory(), "Whiteship", "wonpyol@gmail.com");
        client.createFactory(new BlackShipFactory(), "Blackship", "wonpyol@gmail.com");
    }

    public void createFactory(ShipFactory shipFactory, String name , String email) {
        Ship ship = shipFactory.orderShip(name, email);
        System.out.println("ship = " + ship);
    }

}
