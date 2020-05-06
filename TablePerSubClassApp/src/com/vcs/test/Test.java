package com.vcs.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.model.Mbastudent1;
import com.vcs.model.Student;
import com.vcs.util.HibernateUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		
		Mbastudent1 mbastudent=new Mbastudent1();
		mbastudent.setMbastream("MBA");
		mbastudent.setSno(23);
		mbastudent.setSname("shiva");
		
		session.save(mbastudent);
		transaction.commit();
	}

}
