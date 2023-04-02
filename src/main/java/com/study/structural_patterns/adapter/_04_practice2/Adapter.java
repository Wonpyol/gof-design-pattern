package com.study.structural_patterns.adapter._04_practice2;

public class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public Response request() {
        System.out.println("응 수정하고 너꺼 콜할게");
        return adaptee.specificRequest();
    }
}
