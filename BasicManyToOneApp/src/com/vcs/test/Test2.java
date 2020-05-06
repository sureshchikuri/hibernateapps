package com.vcs.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.hibernate.Dept;
import com.vcs.hibernate.Emp;
import com.vcs.util.HibernateUtil;

public class Test2 {

	public static void main(String[] args) {

		
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		Dept dept=new Dept();
		dept.setDno("2");
		dept.setDname("electronics");
		
		
		Emp emp =new Emp();
		emp.setEno("4");
		emp.setEname("Kiran");
		
		emp.setDept(dept);
		
		session.save(emp);
		
		tx.commit();

	}

}
