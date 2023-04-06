package com.study.structural_patterns.decorator._03_practice;

public class DatasourceDecorator implements DataSource {
    private DataSource wrappee;

    public DatasourceDecorator(DataSource dataSource) {
        this.wrappee = dataSource;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);

    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
