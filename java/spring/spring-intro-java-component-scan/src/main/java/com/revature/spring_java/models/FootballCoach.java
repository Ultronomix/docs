package com.revature.spring_java.models;

import com.revature.spring_java.services.MotivationService;
import com.revature.spring_java.services.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Value("${coach-email}") // Spring Expression Language (SpEL)
    private String email;

    @Value("The Giant Roberts")
    private String teamName;

    @Value("#{12 * 2}") // Spring Expression Language (SpEL)
    private int teamSize;
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

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public MotivationService getMotivationService() {
        return motivationService;
    }

    @Autowired
    public void setMotivationService(MotivationService motivationService) {
        this.motivationService = motivationService;
    }

    public WorkoutService getWorkoutService() {
        return workoutService;
    }

    @Autowired
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
