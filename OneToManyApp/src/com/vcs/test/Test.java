package com.vcs.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.model.Dept1;
import com.vcs.model.Emp1;
import com.vcs.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
		Session session= HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		
		Emp1 emp1=new Emp1();
		emp1.setEno(33);
		emp1.setEname("vijay");
		
		Emp1 emp=new Emp1();
		emp1.setEno(22);
		emp1.setEname("ravi");
		
		Set<Emp1> empSet=new HashSet<Emp1>();
		
		empSet.add(emp1);
		empSet.add(emp);
		
		Dept1 dept=new Dept1();
		dept.setDno(11);
		dept.setDname("ece");
		dept.setEmp1s(empSet);
		
		session.save(dept);
		
		transaction.commit();
	}
}
