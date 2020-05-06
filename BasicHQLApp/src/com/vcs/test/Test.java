package com.vcs.test;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.util.HibernateUtil;

public class Test {

	
	public static void main(String[] args) {
		
		Session  session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		//String qry="FROM Student1";
		//String qry="DELETE FROM Student1 WHERE sname=:sname";
		String qry="UPDATE Student1 SET sname='rajesh' WHERE sno=:sno";
		
		Query query=session.createQuery(qry);
		query.setString("sno", "1");
		//query.setString("sname", "sriram");
		query.executeUpdate();
		
		//List stuList=query.list();
		
		
		//System.out.println(stuList.size());
		
		tx.commit();
	}

}
