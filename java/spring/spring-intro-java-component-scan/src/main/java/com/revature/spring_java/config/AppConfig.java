package com.revature.spring_java.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.spring_java.models.Coach;
import com.revature.spring_java.models.FootballCoach;
import com.revature.spring_java.models.TrackCoach;
import com.revature.spring_java.services.MotivationService;
import com.revature.spring_java.services.WorkoutService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("com.revature") // if no package string is provided, then Spring will scan this class's package
public class AppConfig {

    // When @ComponentScan is present on a config class, Spring will scan the specified package and its
    // sub-packages for classes annotated with one of the following:
    //  - @Component (generic, not specific to a particular layer of the app)
    //  - @Controller / @RestController (web-layer specific component)
    //  - @Service (service/business-layer specific component)
    //  - @Repository (data access layer specific component)

    @Bean // beans that were not made by us can still be declared as beans
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

}
