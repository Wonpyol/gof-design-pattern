package com.study.structural_patterns.adapter._04_practice2;

public class Adaptee {
    Response specificRequest() {
        System.out.println("로직 수정 안되!!!");
        return new Response();
    }
}
