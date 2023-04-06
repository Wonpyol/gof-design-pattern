package com.study.structural_patterns.decorator._03_practice;

public class CompressionDecorator extends DatasourceDecorator {

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        String appand = data + "->CompressionDecorator";
        super.writeData(appand);
    }

    @Override
    public String readData() {
        return super.readData();
    }
}
