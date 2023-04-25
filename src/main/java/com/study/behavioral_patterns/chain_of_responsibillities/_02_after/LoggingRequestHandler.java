package com.study.behavioral_patterns.chain_of_responsibillities._02_after;

import com.study.behavioral_patterns.chain_of_responsibillities._01_before.Request;

public class LoggingRequestHandler extends BaseRequestHandler{
    @Override
    public void handler(Request request) {
        System.out.println("request = " + request.getBody());
        System.out.println("로깅");
        super.handler(request);
    }
}
