package com.study.behavioral_patterns.chain_of_responsibillities._03_middleware;

public class Client {
    public static void main(String[] args) {
        Server server = new Server();
        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExitsMiddleware(server),
                new RoleCheckMiddleware(),
                new RoleCheck2Middleware());

        //ThrottlingMiddleware, RoleCheck2Middleware
        server.setMiddleware(middleware);


//        /**/server.login("3123", "123123");
//        server.login("wonpyol@gmail.com", "123123");
        server.login("wonpyol@gmail.com", "1234");

    }
}
