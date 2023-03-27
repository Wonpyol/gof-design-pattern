package com.study.creational_patterns.factory_method._02_after_interface;

public class BlackShip extends Ship {
    public BlackShip(String name) {
        setColor("black");
        setLogo("black logo");
        setName(name);
    }
}
