package com.revature.aopdemo.service;


import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;


// this is a "regular" service class that we would see in our projects:
// Nothing AOP related in this class
@Service
@Slf4j
public class EmployeeService {

    // this would let us get an employee by an id, but in this case
    // we're just going to throw an exception:
    public Object getEmployeeById(int empId) throws Exception {
        log.info("------ Get Employee By Id -------");
        throw new Exception("Exception occurred wile retrieving employee.");
    }

    // printing out the message Hello
    public void hello() {
        System.out.println("Hello");
    }

    // arbitrarily return 10
    public int getId() {
        return 10;
    }

}

