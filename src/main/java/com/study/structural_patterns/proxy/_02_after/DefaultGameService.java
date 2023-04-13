package com.study.structural_patterns.proxy._02_after;

public class DefaultGameService implements GameService{
    @Override
    public void startGame() {
        System.out.println("게임시작");
    }
}
