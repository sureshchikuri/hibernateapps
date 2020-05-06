package com.vcs.test;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.util.HibernateUtil;

public class Test {

	
	public static void main(String[] args) {

		Session  session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		//1
		//String query="SELECT SNO,SNAME FROM STUDENT1";
		//2&3
		String query="SELECT AVG(SNO)AS AVG FROM STUDENT1";
		
		SQLQuery sqlQuery=session.createSQLQuery(query);
		
		//1
		//List stuList=sqlQuery.list();
		//System.out.println(stuList.size());
		//2
		//Object object=sqlQuery.list();
		//3
		//sqlQuery.addScalar("AVG",Hibernate.DOUBLE);
		Double avg=(Double) sqlQuery.uniqueResult();
		System.out.println(avg);
			
			tx.commit();
	}

}
