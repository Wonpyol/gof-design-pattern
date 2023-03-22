package com.study.creational_pattern.factory_method._04_practice1.product;

public class KakaUser implements User{
    @Override
    public void signUp() {
        System.out.println("카카오 아이디로 가입");
    }
}
