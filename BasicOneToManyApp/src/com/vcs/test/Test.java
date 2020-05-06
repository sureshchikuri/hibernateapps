package com.vcs.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.hibernate.Dept;
import com.vcs.hibernate.Emp;
import com.vcs.util.HibernateUtil;

public class Test {

	
	public static void main(String[] args) {

		Emp emp1=new Emp();
		emp1.setEno("1");
		emp1.setEname("suri");
		
		Emp emp2=new Emp();
		emp2.setEno("2");
		emp2.setEname("kiran");
		
		Set<Emp> empSet=new HashSet<Emp>();
		empSet.add(emp1);
		empSet.add(emp2);
		
		Dept dept=new Dept();
		dept.setDno("1");
		dept.setDname("computers");
		
		dept.setEmps(empSet);
		
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		session.save(dept);
		
		tx.commit();
	}

}
