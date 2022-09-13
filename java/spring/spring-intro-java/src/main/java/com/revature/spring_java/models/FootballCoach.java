package com.revature.spring_java.models;

import com.revature.spring_java.services.MotivationService;
import com.revature.spring_java.services.WorkoutService;

public class FootballCoach implements Coach {

    private String email;
    private String teamName;
    private MotivationService motivationService;
    private WorkoutService workoutService;

    public FootballCoach() {
        System.out.println("FootballCoach#<init> invoked!");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public MotivationService getMotivationService() {
        return motivationService;
    }

    public void setMotivationService(MotivationService motivationService) {
        this.motivationService = motivationService;
    }

    public WorkoutService getWorkoutService() {
        return workoutService;
    }

    public void setWorkoutService(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @Override
    public String getDailyWorkout() {
        return workoutService.fetchWorkoutRegimen("football");
    }

    @Override
    public String getMotivation() {
        return motivationService.fetchMotivationalQuote();
    }

}
