package com.jdbcTemplate.Dao;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbctemplate.model.Employee;

public class EmployeeDao {
	private JdbcTemplate  jdbcTemplet;

	public void setJdbcTemplet(JdbcTemplate jdbcTemplet) {
		this.jdbcTemplet = jdbcTemplet;
	}
	public int saveEmployee(Employee emp)
	{
		String query="insert into Employee values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getSalary()+"')";
		return jdbcTemplet.update(query);
	}
	public int updateEmployee(Employee emp)
	{
		String query="Update Employee set name='"+emp.getName()+"'"+emp.getSalary()+"'where id="+emp.getId()+"'";
		return jdbcTemplet.update(query);
	}
	public int deleteEmployee(Employee emp)
	{
		String query="Delete from Employee where id='"+emp.getId()+"'";
		return jdbcTemplet.update(query);
	}
}
