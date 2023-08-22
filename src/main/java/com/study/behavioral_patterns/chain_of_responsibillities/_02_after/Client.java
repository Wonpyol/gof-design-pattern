package com.study.behavioral_patterns.chain_of_responsibillities._02_after;

import com.study.behavioral_patterns.chain_of_responsibillities._01_before.Request;

public class Client {
    public static void main(String[] args) {
        Request request = new Request("알로하");
        RequestHandler handler = new LoggingRequestHandler();
        handler.setNext(new AuthRequestHandler());
        handler.setNext(new UserCheckRequestHandler());
        handler.handler(request);
    }
}
