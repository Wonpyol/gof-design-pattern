package com.study.creational_pattern.factory_method._04_practice2;

public class Client {
    public static void main(String[] args) {
        CheckinFactory checkinFactory = new CourseCheckinFactory();
        checkinFactory.newInstance();
    }
}
