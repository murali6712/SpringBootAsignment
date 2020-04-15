package com.cg.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee emp = (Employee) context.getBean("employeeDetails");
		System.out.println("Employee details");
		System.out.println("-----------------------------");
		System.out.println("Employee ID : " + emp.getEmployeeId());
		System.out.println("Employee Name : "+ emp.getEmployeeName());
		System.out.println("Employee Salary : "+ emp.getSalary());
		System.out.println("Employee BU : "+ emp.getBusinessUnit());
		System.out.println("Employee Age : "+ emp.getAge());
		System.out.println("sbuCode=" + emp.getSbu().getSbuId());
		System.out.println("sbuHead=" + emp.getSbu().getSbuHead());
		System.out.println("sbuName=" + emp.getSbu().getSbuName());
	}

}
