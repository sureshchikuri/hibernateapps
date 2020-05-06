package com.vcs.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.model.Student;
import com.vcs.model.StudentXtra;
import com.vcs.util.HibernateSessionFactory;

public class Test {


	public static void main(String[] args) {

		Session session=HibernateSessionFactory.getSession();
		Transaction transaction=session.beginTransaction();
		
		Student student=new Student();
		
		student.setSno(73);
		student.setSname("raj");
		
		StudentXtra studentXtra=new StudentXtra();
		studentXtra.setSage("25");
		studentXtra.setStudent(student);
		
		session.save(studentXtra);
		
		transaction.commit();
	}

}
