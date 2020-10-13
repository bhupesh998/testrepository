package com.zensar.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.bean.Employee;

public class Test {

	public static void main(String[] args) {
	
	
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");

		Employee empl=(Employee)context.getBean("emp");
		empl.setEmployeeId(101);
		empl.setEmployeeName("ram");
		empl.setEmployeeSalary(1000);
		System.out.println(empl);
		
		
	}

}
