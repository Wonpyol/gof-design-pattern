package com.study.creational_pattern.factory_method._02_after_interface;

import com.study.creational_pattern.factory_method._02_after_interface.Ship;

public class BlackShip extends Ship {
    public BlackShip(String name) {
        setColor("black");
        setLogo("black logo");
        setName(name);
    }
}
