package com.revature;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.beans.SpringBean;

public class Driver {
	
	public static void main(String[] args) {

		System.out.println("Creating bean container");
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		container.registerShutdownHook();
		System.out.println("Bean container created!");
		
		System.out.println("Retrieving SpringBean instance from container");
		container.getBean("springBean", SpringBean.class);
		System.out.println("SpringBean instance retrieved from container");
		
		System.out.println("Container shutting down");
		container.close();
	}

}
