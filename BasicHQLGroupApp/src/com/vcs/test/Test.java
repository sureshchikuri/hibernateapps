package com.vcs.test;


import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.util.HibernateUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 1
		//String qry="SELECT COUNT(sname),AVG(sno) FROM Student1";
		
		//2
		String qry="SELECT sno,sname FROM Student1";

		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		Query query=session.createQuery(qry);
		
		//1
		//Object result[]=(Object[]) query.uniqueResult();
		
		//2
		List stuList=query.list();
		
		System.out.println(stuList);
		
		tx.commit();
	}

}
