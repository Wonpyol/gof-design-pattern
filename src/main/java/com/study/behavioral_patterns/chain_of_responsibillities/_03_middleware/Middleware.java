package com.study.behavioral_patterns.chain_of_responsibillities._03_middleware;

public abstract class Middleware {
    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            System.out.println(head.next.getClass());
        }
        return first;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password){
        if(next == null) return true;

        return next.check(email, password);
    }

}
