package com.revature.aopdemo.aop;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AfterThrowingAspectExample {


    // this method will execute whenever an exception is thrown when the certain conditions are met:
    // first * says we're going to match any return type
    // then we set up the package. In this case, we're matching any sub-package in the entire
    // 2 dots mean match the sub-packages within com.revature.aopdemo
    // second * matches any method name
    // The second set of 2 dots means we match any number of parameters
    @AfterThrowing(pointcut = "execution(* com.revature.aopdemo..*(..))", throwing = "ex")
    public void logAfterThrowingException(Exception ex) {
        log.info("--------- Spring AOP After Throwing Exception ----------");
        log.info(ex.getMessage());
        // do any other business logic, such as emailing the CEO "hey, an exception happened"
    }
}
