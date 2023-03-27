package com.study.creational_patterns.abstract_factory._04_paractice1;

import com.study.creational_patterns.abstract_factory._04_paractice1.factory.GolfFactory;
import com.study.creational_patterns.abstract_factory._04_paractice1.factory.SoccerFactory;
import com.study.creational_patterns.abstract_factory._04_paractice1.factory.StaffFactory;
import com.study.creational_patterns.abstract_factory._04_paractice1.productA.Manager;
import com.study.creational_patterns.abstract_factory._04_paractice1.productB.Player;

public class Client {

    private final StaffFactory staffFactory;

    public Client(StaffFactory staffFactory) {
        this.staffFactory = staffFactory;
    }

    public Player createPlayer() {
        Player player = staffFactory.createPlayer();
        System.out.println("player = " + player.getClass());
        return player;
    }

    public Manager createManager() {
        Manager manager = staffFactory.createManager();
        System.out.println("manager = " + manager.getClass());
        return manager;
    }

    public static void main(String[] args) {
        Client client = new Client(new GolfFactory());
        System.out.println(client.createManager());
        System.out.println(client.createPlayer());

        Client client1 = new Client(new SoccerFactory());
        System.out.println(client1.createManager());
        System.out.println(client1.createPlayer());
    }
}
