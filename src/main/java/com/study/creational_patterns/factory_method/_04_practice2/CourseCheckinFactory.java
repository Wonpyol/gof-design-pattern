package com.study.creational_patterns.factory_method._04_practice2;

public class CourseCheckinFactory extends CheckinFactory {
    @Override
    Checkin createCheckin() {
        return new Course();
    }
}
