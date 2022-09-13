package com.revature.spring_xml.models;

import com.revature.spring_xml.services.MotivationService;
import com.revature.spring_xml.services.WorkoutService;

public class TrackCoach implements Coach {

    private final MotivationService motivationService;
    private final WorkoutService workoutService;

    // Constructor injection
    public TrackCoach(MotivationService motivationService, WorkoutService workoutService) {
        System.out.println("TrackCoach#<init> invoked!");
        this.motivationService = motivationService;
        this.workoutService = workoutService;
    }

    @Override
    public String getDailyWorkout() {
        return workoutService.fetchWorkoutRegimen("track");
    }

    @Override
    public String getMotivation() {
        return motivationService.fetchMotivationalQuote();
    }

    @Override
    public MotivationService getMotivationService() {
        return motivationService;
    }

}
