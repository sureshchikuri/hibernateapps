package com.vcs.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.model.Course;
import com.vcs.model.Student;
import com.vcs.util.HibernateSessionFactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateSessionFactory.getSession();
		Transaction transaction=session.beginTransaction();
		
		Student student=new Student();
		student.setSname("raju");
		student.setSno(43);
		
		Student student2=new Student();
		student2.setSno(44);
		student2.setSname("mahesh");
		
		Set< Student> stuSet=new HashSet<Student>();
		stuSet.add(student);
		stuSet.add(student2);
		
		Course course=new Course();
		course.setCno(63);
		course.setCname("java");
		
		course.setStudents(stuSet);
		
		session.save(course);
		
		transaction.commit();
	}

}
