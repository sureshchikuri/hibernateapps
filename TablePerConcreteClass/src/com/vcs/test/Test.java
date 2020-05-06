package com.vcs.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.model.Mbastudent;
import com.vcs.model.Mcastudent;
import com.vcs.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();

		Mbastudent mbastudent = new Mbastudent();
		mbastudent.setMbastream("mba");
		mbastudent.setSno(22);
		mbastudent.setSname("kiran");
		
		session.save(mbastudent);
		transaction.commit();

	}
}
