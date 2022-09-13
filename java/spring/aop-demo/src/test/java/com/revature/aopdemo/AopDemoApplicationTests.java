package com.revature.aopdemo;

import com.revature.aopdemo.service.CustomerService;
import com.revature.aopdemo.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopDemoApplicationTests {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private CustomerService customerService;

	@Test
	public void contextLoads() {
	}

	@Test(expected = Exception.class)
	public void testGetEmployeeById() throws Exception {
		// when this test runs, it should throw an exception:
		employeeService.getEmployeeById(123);
	}

	@Test
	public void testHello() {
		// this method should NOT throw an exception:
		employeeService.hello();
	}

	@Test(expected = Exception.class)
	public void testGetCustomerById() throws Exception {
		// this method should throw an exception:
		customerService.getCustomerById(456);
	}

	@Test
	public void testReturns() {
		// Both of these methods return a value, but only the customer will be logged because
		// that's how we configured it in the Aspect class:
		employeeService.getId();
		customerService.getId();
	}




}
