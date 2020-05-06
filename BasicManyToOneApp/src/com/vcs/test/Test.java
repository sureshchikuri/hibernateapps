package com.vcs.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.hibernate.Dept;
import com.vcs.hibernate.Emp;
import com.vcs.util.HibernateUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		Dept dept=(Dept) session.get(Dept.class, "1");
		
		Emp emp =new Emp();
		emp.setEno("3");
		emp.setEname("suresh");
		
		emp.setDept(dept);
		
		session.save(emp);
		
		tx.commit();
	}

}
