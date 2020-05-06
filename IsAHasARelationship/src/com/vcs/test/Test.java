package com.vcs.test;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.model.Address;
import com.vcs.model.Student11;
import com.vcs.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
		Session session= HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		Address address=new Address();
		address.setPin(508252);
		address.setStreet("AutoNagar");
		
		Student11 student=new Student11();
		student.setStudentNo(1);
		student.setStudentName("suri");
		student.setAddress(address);
		
		session.save(student);
		tx.commit();
	}
}
