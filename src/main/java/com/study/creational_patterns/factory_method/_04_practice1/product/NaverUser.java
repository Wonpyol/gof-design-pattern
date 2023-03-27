package com.study.creational_patterns.factory_method._04_practice1.product;

public class NaverUser implements User{
    @Override
    public void signUp() {
        System.out.println("네이버 아이디로 가입");
    }
}
