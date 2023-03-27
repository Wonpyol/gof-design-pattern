package com.study.creational_patterns.builder._02_after;

import com.study.creational_patterns.builder._01_before.TourPlan;

public class App {
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefalutTourPlanBuilder());
        TourPlan cancunTrip = director.createCancunTrip();
        System.out.println("cancunTrip = " + cancunTrip);

        TourDirector director1 = new TourDirector(new DefalutTourPlanBuilder());
        TourPlan longBeachTrip = director1.createLongBeachTrip();
        System.out.println("longBeachTrip = " + longBeachTrip);
    }

}
