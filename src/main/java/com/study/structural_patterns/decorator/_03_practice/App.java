package com.study.structural_patterns.decorator._03_practice;

public class App {
    public static void main(String[] args) {
        DataSource dataSource= new FileDataSource();
        DatasourceDecorator decorator = new DatasourceDecorator(new EncryptionDecorator(new CompressionDecorator(dataSource)));
        decorator.writeData("test");
        decorator.readData();


    }
}
