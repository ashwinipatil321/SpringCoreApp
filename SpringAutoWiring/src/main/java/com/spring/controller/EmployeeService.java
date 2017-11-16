package com.spring.controller;

import com.spring.model.Employee;

public class EmployeeService {

	private Employee employee;

	public EmployeeService() {
		super();
	}
	public EmployeeService(Employee employee) {
		super();
		System.out.println("Autowiring by constructor used");
		this.employee = employee;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
