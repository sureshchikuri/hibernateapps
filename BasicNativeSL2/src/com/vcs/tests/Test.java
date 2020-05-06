package com.vcs.tests;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.test.HibernateUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		//1
		//String qry="SELECT SNO,SNAME FROM STUDENT1";
		String qry="SELECT AVG(SNO),COUNT(SNAME) FROM STUDENT1";
		
		SQLQuery query=session.createSQLQuery(qry);
		//1
		//List stuList=query.list();
		//System.out.println(stuList.size());
		
		Object[] object=(Object[]) query.uniqueResult();
		System.out.println(object[0]);
	}

}
