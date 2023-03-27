package com.study.creational_patterns.builder._02_after;

import com.study.creational_patterns.builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {
    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan createCancunTrip() {
        return tourPlanBuilder.title("칸쿤")
                .startDate(LocalDate.now())
                .nightsAndDays(2, 3)
                .whereToStay("리조트")
                .addPlan(1, "체크인")
                .addPlan(2, "저녁식사")
                .getPlan();
    }

    public TourPlan createLongBeachTrip() {
        return tourPlanBuilder.title("롱비치")
                .startDate(LocalDate.now())
                .getPlan();
    }
}
