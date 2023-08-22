package com.study.behavioral_patterns.chain_of_responsibillities._03_middleware;
import java.util.Map;

public class Server {
    private Map<String, String> users = Map.of("wonpyol@gmail.com", "1234");
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }
    public boolean login(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successful!");
            return true;
        }
        return false;
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }
    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
