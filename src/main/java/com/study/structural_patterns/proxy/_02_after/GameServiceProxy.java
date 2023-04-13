package com.study.structural_patterns.proxy._02_after;

public class GameServiceProxy implements GameService{

    private GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void startGame() {
        System.out.println("proxy start");
        gameService.startGame();
        System.out.println("proxy end");
    }
}
