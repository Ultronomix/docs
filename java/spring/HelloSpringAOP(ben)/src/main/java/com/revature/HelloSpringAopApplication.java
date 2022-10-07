package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.daos.AvengerDAO;
import com.revature.models.Avenger;

@SpringBootApplication
public class HelloSpringAopApplication {

	//We need to make a ApplicationContext to get beans for AOP to work
	static ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringAopApplication.class, args);
		
		//we had to go to run -> run configurations -> uncheck enable JMX
		//we ALSO had to make sure we weren't using devtools as a dependency
		
		//Make an Avenger object (we can see our @Before advices run here)
		//NOTE: It must be an Avenger BEAN specifically
		Avenger a = ac.getBean(Avenger.class);
		
		//use the Avenger setter to set some values and see some logs
		a.setAveId(10);
		a.setAveName("Frozone");
		a.setFirstName("Lucious");
		a.setPower("Honey where is my supersuit????");
		
		//so we can see that BEFORE any method in the models package runs, we get a log in the console
		//this is thanks to our @Before advice in our LoggingAspect
		
		
		//making Frozone fight to show our @AfterReturning advice working
		AvengerDAO aDAO = ac.getBean(AvengerDAO.class);
		
		System.out.println(aDAO.fight(a, "Freezes you >:D", 15));
		
	}

}
