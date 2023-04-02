package com.study.structural_patterns.adapter._04_practice2;

public class App {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        adaptee.specificRequest();
        Adapter adapter = new Adapter(new Adaptee());
        adapter.request();


    }
}
