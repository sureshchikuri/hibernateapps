package com.vcs.test;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.hibernate.Student1;
import com.vcs.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		Student1 student=new Student1();
		//student.setSno(3l);
		student.setSname("vicky");
		
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
	    session.save(student);
		//session.update(student);
		//session.delete(student);
		
		//Student1 student=(Student1) session.get(Student1.class, 1l);
		
		System.out.println(student);
		tx.commit();
	}
}
