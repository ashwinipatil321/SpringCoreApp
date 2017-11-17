package com.hibernateAndSpring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hibernateAndSpring.Dao.EmployeeDao;
import com.hibernateAndSpring.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	 @Autowired
	    private EmployeeDao dao;
	     
	    public void saveEmployee(Employee employee) {
	        dao.saveEmployee(employee);
	    }
	 
	    public List<Employee> findAllEmployees() {
	        return dao.findAllEmployees();
	    }
	 
	    public void deleteEmployeeBySsn(String ssn) {
	        dao.deleteEmployeeBySsn(ssn);
	    }
	 
	    public Employee findBySsn(String ssn) {
	        return dao.findBySsn(ssn);
	    }
	 
	    public void updateEmployee(Employee employee){
	        dao.updateEmployee(employee);
	    }
}
