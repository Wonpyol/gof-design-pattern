package com.study.behavioral_patterns.chain_of_responsibillities._02_after;

import com.study.behavioral_patterns.chain_of_responsibillities._01_before.Request;

public class BaseRequestHandler implements RequestHandler {

    private RequestHandler nextHandler;

    @Override
    public void setNext(RequestHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handler(Request request) {
        if (nextHandler != null) {
            nextHandler.handler(request);
        }

    }
}
