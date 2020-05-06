package com.vcs.test;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.hibernate.Student1;
import com.vcs.util.HibernateUtil;

public class TestEntity {

	
	public static void main(String[] args) {

		Session  session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		String qry="SELECT * FROM STUDENT1 STU";
		
		SQLQuery query=session.createSQLQuery(qry);
		
		query.addEntity("STU",Student1.class);
		
		List stuList=query.list();
		
		System.out.println(stuList.size());
		
		
		tx.commit();
	}

}
