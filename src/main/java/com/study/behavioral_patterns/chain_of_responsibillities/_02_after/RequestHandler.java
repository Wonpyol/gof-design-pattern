package com.study.behavioral_patterns.chain_of_responsibillities._02_after;

import com.study.behavioral_patterns.chain_of_responsibillities._01_before.Request;

public interface RequestHandler {
    void setNext(RequestHandler handler);

    void handler(Request request);
}
