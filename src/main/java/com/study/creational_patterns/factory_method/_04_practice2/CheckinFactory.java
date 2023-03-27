package com.study.creational_patterns.factory_method._04_practice2;

public abstract class CheckinFactory {
    public Checkin newInstance() {
        Checkin checkin = createCheckin();
        checkin.checkin();
        return checkin;
    }
    abstract Checkin createCheckin();
}
