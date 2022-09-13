package com.revature.spring_java.models;

import com.revature.spring_java.services.MotivationService;
import com.revature.spring_java.services.WorkoutService;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class TrackCoach implements Coach {

    private final MotivationService motivationService;
    private final WorkoutService workoutService;

    // Constructor injection (mandatory dependencies)
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
