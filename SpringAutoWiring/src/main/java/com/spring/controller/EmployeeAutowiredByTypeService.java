package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.model.Employee;

public class EmployeeAutowiredByTypeService {

	@Autowired
	private Employee employee;
	
	@Autowired
	public void setEmployee(Employee emp){
		this.employee=emp;
	}
	
	public Employee getEmployee(){
		return this.employee;
	}
}
