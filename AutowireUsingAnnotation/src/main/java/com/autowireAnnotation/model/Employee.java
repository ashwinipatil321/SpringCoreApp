package com.autowireAnnotation.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	@Autowired
	private EmployeeAddress address;

	public EmployeeAddress getAddress() {
		return address;
	}

	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
