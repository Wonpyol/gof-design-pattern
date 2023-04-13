package com.study.structural_patterns.proxy._02_after;

public class Client {

    public static void main(String[] args) {
        GameServiceProxy gameServiceProxy = new GameServiceProxy(new DefaultGameService());
        gameServiceProxy.startGame();
    }
}
