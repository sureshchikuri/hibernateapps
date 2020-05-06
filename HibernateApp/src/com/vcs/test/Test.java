package com.vcs.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vcs.model.Employee;

public class Test {

	
	public static void main(String[] args) {

		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory  sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		//Employee employee=new Employee();
		//employee.setEmployeeId(12);
		//employee.setEmployeeName("shiva");
		//employee.setEmployeeSalary("30000");
	 
		//session.save(employee);
		Employee employee=  (Employee) session.get(Employee.class, 11);
		
		System.out.println(employee.toString());
		//transaction.commit();
	}

}
