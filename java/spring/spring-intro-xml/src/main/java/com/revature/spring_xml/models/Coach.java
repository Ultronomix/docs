package com.revature.spring_xml.models;

import com.revature.spring_xml.services.MotivationService;

public interface Coach {
    String getDailyWorkout();
    String getMotivation();
    MotivationService getMotivationService();
}
