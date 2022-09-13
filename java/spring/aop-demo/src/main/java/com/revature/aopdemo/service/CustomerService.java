package com.revature.aopdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerService {

    // similarly to the employee class, just throw an exception:
    public Object getCustomerById(int custId) throws Exception {
        log.info("------- getCustomerById Method -------");
        throw new Exception("Exception occurred while retrieving customer.");
    }

    // arbritray integer:
    public int getId() {
        return 20;
    }
}
