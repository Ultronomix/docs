package com.revature.spring_java.models;

import com.revature.spring_java.services.MotivationService;
import com.revature.spring_java.services.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("myCoach") // the component/bean name by default is the class name in camelCase
public class BaseballCoach implements Coach {

    private final MotivationService motivationService;
    private final WorkoutService workoutService;

    @Autowired // for constructor injection, this annotation isn't technically required
    public BaseballCoach(MotivationService motivationService, WorkoutService workoutService) {
        System.out.println("BaseballCoach#<init> invoked!");
        this.motivationService = motivationService;
        this.workoutService = workoutService;
    }

    @Override
    public String getDailyWorkout() {
        return workoutService.fetchWorkoutRegimen("baseball");
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
