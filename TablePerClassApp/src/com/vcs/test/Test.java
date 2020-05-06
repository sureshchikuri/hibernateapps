package com.vcs.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.model.MbaStream;
import com.vcs.model.McaStream;
import com.vcs.model.Student22;
import com.vcs.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
		
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		
		McaStream mcaStream=(McaStream) session.get(McaStream.class, 2);
	
		//mcaStream.setStudentno(2);
		//mcaStream.setStudentname("suri");
		mcaStream.setMcaStream("MCA-Marketing");
		
		//session.merge(mcaStream);
		
		transaction.commit();
	}
}
