package com.study.structural_patterns.flyweight._02_after;

import com.study.structural_patterns.flyweight._02_after.flyweight_factory.FontFactory;

public class Client {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character character1 = new Character('f', "white", fontFactory.getFont("nanum:12"));
        Character character2 = new Character('l', "white", fontFactory.getFont("nanum:12"));
        Character character3 = new Character('y', "white", fontFactory.getFont("nanum:12"));
    }
}
