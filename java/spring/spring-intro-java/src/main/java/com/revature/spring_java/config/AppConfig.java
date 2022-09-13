package com.revature.spring_java.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.spring_java.models.Coach;
import com.revature.spring_java.models.FootballCoach;
import com.revature.spring_java.models.TrackCoach;
import com.revature.spring_java.services.MotivationService;
import com.revature.spring_java.services.WorkoutService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Value("${coach-email}")
    private String coachEmail;

    @Bean // beans that were not made by us can still be declared as beans
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean // name of the method is the bean ID
    public MotivationService motivationServiceBean() {
        return new MotivationService();
    }

    @Bean("workoutServiceBean")
    public WorkoutService workoutService() {
        return new WorkoutService();
    }

    @Bean("myCoach")
    @Scope("prototype")
    public Coach someCoach() {
        return new TrackCoach(motivationServiceBean(), workoutService());
    }

    @Bean
    public FootballCoach footballCoach() {
        FootballCoach footballCoach = new FootballCoach();
        footballCoach.setWorkoutService(workoutService());
        footballCoach.setMotivationService(motivationServiceBean());
        footballCoach.setTeamName("The Silly Louies");
        footballCoach.setEmail(coachEmail);
        return footballCoach;
    }

}
