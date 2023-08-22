package com.study.behavioral_patterns.chain_of_responsibillities._03_middleware;

public class RoleCheckMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        System.out.println("RoleCheckMiddleware");
//        if (email.equals("wonpyol@gmail.com")) {
//            System.out.println("Hello, admin!");
//            return true;
//        }
        return checkNext(email, password);
    }
}
