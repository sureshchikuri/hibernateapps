package com.vcs.test;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.pojo.MbaStream;
import com.vcs.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		MbaStream mbaStream=new MbaStream();
		mbaStream.setMbaStream("MBA");
		mbaStream.setStudentNo("1");
		mbaStream.setStudentName("vijay");
		
		session.save(mbaStream);
		tx.commit();
	}

}
