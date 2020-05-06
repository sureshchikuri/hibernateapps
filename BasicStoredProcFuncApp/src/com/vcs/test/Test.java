package com.vcs.test;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.util.HibernateUtil;

public class Test {

	
	public static void main(String[] args) {

		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		Query query=session.getNamedQuery("stuproc");
		query.setString("sno", "1");
		
		List list=query.list();
		
		System.out.println(list.size());
		
		tx.commit();
	}

}
