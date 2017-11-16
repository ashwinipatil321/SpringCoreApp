package com.Autowiring.SpringAutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.model.Employee;

public class EmployeeAutowiredByConstructorService {

	private Employee employee;

	@Autowired(required=false)
	public EmployeeAutowiredByConstructorService(@Qualifier("employee") Employee emp){
		this.employee=emp;
	}
	
	public Employee getEmployee() {
		return this.employee;
	}
	
}
