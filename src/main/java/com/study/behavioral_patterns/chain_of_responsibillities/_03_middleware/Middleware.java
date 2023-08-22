package com.study.behavioral_patterns.chain_of_responsibillities._03_middleware;

public abstract class Middleware {
    public Middleware next;

    public static Middleware link1(Middleware... chain) {
        //chain a,b,c
        Middleware c = null;
        for (Middleware nextInChain : chain) {
            c = nextInChain;
        }
        return null;
    }

    public static Middleware link(Middleware first, Middleware second) {
        //first a, //chain b,c,d
        Middleware head = first; //a
        head.next = second;
        return first;
    }

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password){
        System.out.println("next = " + next);
        if(next == null) return true;

        return next.check(email, password);
    }

}
