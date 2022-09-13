package com.revature.spring_xml.services;

public class WorkoutService {

    public WorkoutService() {
        System.out.println("WorkoutService#<init> invoked!");
    }

    public String fetchWorkoutRegimen(String coachType) {
        switch (coachType.toLowerCase()) {
            case "baseball":
                return "Today's workout: Spend an hour on batting practice.";
            case "track":
                return "Today's workout: Run a 30-minute 5k.";
            case "football":
                return "Today's workout: Suicide runs to the 40, 50, 60, 70, 80, and 100 yard lines.";
            default:
                return "No workout to provide. Enjoy your day!";
        }
    }

}
