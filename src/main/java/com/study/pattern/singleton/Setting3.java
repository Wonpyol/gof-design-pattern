package com.study.pattern.singleton;

public class Setting3 {
    private Setting3(){}

    private static class Setting3Holder {
        private static final Setting3 INSTANCE = new Setting3();
    }

    public static Setting3 getInstance() {
        return Setting3Holder.INSTANCE;
    }

    static class Test {
        public static void main(String[] args) {
            Setting3 instance = Setting3.getInstance();
            System.out.println("instance = " + instance);
            Setting3 instanc2 = Setting3.getInstance();
            System.out.println("instanc2 = " + instanc2);
        }
    }
}
