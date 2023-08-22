package com.study.behavioral_patterns.chain_of_responsibillities._03_middleware;

public class RoleCheck2Middleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        System.out.println("RoleCheck2Middleware");
//        if (email.equals("wonpyol@gmail.com")) {
//            System.out.println("Hello, admin!");
//            return true;
//        }
        return checkNext(email, password);
    }
}
