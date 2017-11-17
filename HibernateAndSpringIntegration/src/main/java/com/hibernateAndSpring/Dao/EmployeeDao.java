package com.hibernateAndSpring.Dao;

import java.util.List;

import com.hibernateAndSpring.model.Employee;

public interface EmployeeDao {
	
	 void saveEmployee(Employee employee);
     
	    List<Employee> findAllEmployees();
	     
	    void deleteEmployeeBySsn(String ssn);
	     
	    Employee findBySsn(String ssn);
	     
	    void updateEmployee(Employee employee);
	
}
