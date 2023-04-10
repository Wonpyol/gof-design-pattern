package com.study.structural_patterns.flyweight._02_after;

import com.study.structural_patterns.flyweight._02_after.flyweight.Font;

public class Character {
    //unique state
    private char value;
    private String color;
    //repeating state
    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
