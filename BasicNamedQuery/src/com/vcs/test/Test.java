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
		//1
		//Query query=session.getNamedQuery("hquery");
		//query.setString("sname", "suresh");
		
		Query query=session.getNamedQuery("squery");
		
		//1
		//List stuList=query.list();
		//System.out.println(stuList.size());
		
		Object result=query.uniqueResult();
		
		System.out.println("Result class name:"+result.getClass().getName());
		
		tx.commit();
	}

}
