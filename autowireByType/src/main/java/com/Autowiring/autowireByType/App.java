package com.Autowiring.autowireByType;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.autowiredByType.model.Employee;

public class App 
{
	public static void main( String[] args )
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		//autowire=byType
		Employee employee = (Employee)context.getBean("employee");
		System.out.println("Employee Details : "+employee);
	}
}
