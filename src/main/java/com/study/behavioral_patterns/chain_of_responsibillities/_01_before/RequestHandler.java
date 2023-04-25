package com.study.behavioral_patterns.chain_of_responsibillities._01_before;

public class RequestHandler {

    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}
