package com.study.structural_patterns.decorator._03_practice;


public interface DataSource {
    void writeData(String data);

    String readData();
}
