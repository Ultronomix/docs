package com.revature.spring_xml;

import com.revature.spring_xml.models.Coach;
import com.revature.spring_xml.models.FootballCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlDriver {

    public static void main(String[] args) {

        System.out.println("Creating the bean container...");

        try (ClassPathXmlApplicationContext beanContainer = new ClassPathXmlApplicationContext("beans.xml")) {

            System.out.println("Bean container created!");

            // Retrieve a bean from the container with the id "myCoach"
            Coach headCoach = beanContainer.getBean("myCoach", Coach.class);

            // Call some methods on the retrieved bean to ensure it is wired/configured properly
            System.out.println(headCoach.getDailyWorkout());
            System.out.println(headCoach.getMotivation());

            Coach assistantCoach = beanContainer.getBean("myCoach", Coach.class);
            System.out.println("Is the head coach the same as the assistant coach? :: " + (headCoach == assistantCoach));
            System.out.println("Do the coaches use the same motivation service? :: " + (headCoach.getMotivationService() == assistantCoach.getMotivationService()));

            //-----------------------------------------------------------------------------------------

            FootballCoach footballCoach = beanContainer.getBean(FootballCoach.class);
            System.out.println(footballCoach.getDailyWorkout());
            System.out.println(footballCoach.getMotivation());
            System.out.println(footballCoach.getEmail());
            System.out.println(footballCoach.getTeamName());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
