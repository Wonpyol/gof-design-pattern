package com.study.creational_pattern.builder._02_after;

import com.study.creational_pattern.builder._01_before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {
    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate date);

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();

}
