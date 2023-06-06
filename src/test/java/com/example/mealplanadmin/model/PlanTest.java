package com.example.mealplanadmin.model;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

public class PlanTest {
    @Test
    void emptyConstructorAndAccessors() {
        var plan = new Plan();
        assert (plan.getClosed() == null);
        assert (plan.getTotalDays() == null);
        assert (plan.getStartDate() == null);
        assert (plan.getMealsPerDay() == null);
        assert (plan.getId() == null);
        var startDate = LocalDate.now();
        var mealsPerDay = 4;
        var totalDays = 30;
        var closed = true;
        plan.setStartDate(startDate);
        plan.setMealsPerDay(mealsPerDay);
        plan.setTotalDays(totalDays);
        plan.setClosed(closed);
        assert (plan.getClosed() == closed);
        assert (plan.getTotalDays() == totalDays);
        assert (plan.getStartDate().equals(startDate));
        assert (plan.getMealsPerDay() == mealsPerDay);
        assert (plan.getId() == null);
    }

    @Test
    void constructor() {
        var startDate = LocalDate.now();
        var mealsPerDay = 4;
        var totalDays = 30;
        var plan = new Plan(startDate, totalDays, mealsPerDay);
        assert (!plan.getClosed());
        assert (plan.getTotalDays() == totalDays);
        assert (plan.getStartDate().equals(startDate));
        assert (plan.getMealsPerDay() == mealsPerDay);
        assert (plan.getId() == null);
    }
}
