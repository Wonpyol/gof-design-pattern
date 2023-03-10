package com.study.creational_pattern.factory_method._02_after_interface;

public class WhiteShip extends Ship{
    public WhiteShip(String name) {
        setName(name);
        setColor("white");
        setLogo("white logo");
    }
}
