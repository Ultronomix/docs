package com.revature.aopdemo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AfterReturningAspectExample {


    // Still matching any return type
    // still looking in the aopdemo package, but this time we get more specific and say we only want methods in the CustomerService class
    // still want any method name. We still want any number of parameters
    @AfterReturning(pointcut = "execution(* com.revature.aopdemo.service.CustomerService.*(..))", returning = "value")
    public void logAfterReturning(Object value){
        // whenever a method in the customer service class returns a value, we execute this method, therefore printing out the value that was returned:
        log.info("------ Spring AOP After Returning Example -------");
        log.info("Value returned was: " + value.toString());
        // Handle any additional business logic here (ex: logging this information to a database)
    }
}
