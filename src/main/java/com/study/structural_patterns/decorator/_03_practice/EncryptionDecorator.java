package com.study.structural_patterns.decorator._03_practice;

public class EncryptionDecorator extends DatasourceDecorator{
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        String appand = data + "->EncryptionDecorator";
        super.writeData(appand);
    }

    @Override
    public String readData() {
        return super.readData();
    }
}
