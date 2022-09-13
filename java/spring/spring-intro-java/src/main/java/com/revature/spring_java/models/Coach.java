package com.revature.spring_java.models;

import com.revature.spring_java.services.MotivationService;

public interface Coach {
    String getDailyWorkout();
    String getMotivation();
    MotivationService getMotivationService();
}
