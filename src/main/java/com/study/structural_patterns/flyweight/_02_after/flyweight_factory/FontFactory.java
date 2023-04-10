package com.study.structural_patterns.flyweight._02_after.flyweight_factory;

import com.study.structural_patterns.flyweight._02_after.flyweight.Font;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            System.out.println("hit cache");
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            return newFont;
        }

    }
}
