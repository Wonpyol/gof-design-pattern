package com.study.structural_patterns.composite._02_after;

import com.study.structural_patterns.composite._02_after.component.Component;
import com.study.structural_patterns.composite._02_after.composite.Bag;
import com.study.structural_patterns.composite._02_after.leaf.Item;

public class Client {
    public static void main(String[] args) {
        Item blade = new Item("blade", 450);
        Item potion = new Item("potion", 50);

        Bag bag = new Bag();
        bag.add(blade);
        bag.add(potion);

        Client client = new Client();
        client.printPrice(blade);
        client.printPrice(potion);
        client.printPrice(bag);
    }

    private void printPrice(Component component) {
        System.out.println("component = " + component.getPrice());
    }
}
