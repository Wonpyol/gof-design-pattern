package com.study.structural_patterns.decorator._03_practice;

public class FileDataSource implements DataSource {
    private String name;

    @Override
    public void writeData(String data) {
        this.name = data;

    }

    @Override
    public String readData() {
        System.out.println("name = " + name);
        return this.name;
    }
}
