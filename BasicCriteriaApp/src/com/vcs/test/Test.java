package com.vcs.test;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.vcs.hibernate.Student1;
import com.vcs.util.HibernateUtil;

public class Test {

	
	public static void main(String[] args) {

		//String qry="From Student1";
		
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		Criteria criteria=session.createCriteria(Student1.class);
		Criterion c1=Restrictions.eq("sno", 1);
		Order order=Order.desc("sno");
		criteria.addOrder(order);
		
		List StuList=criteria.list();
		
		System.out.println(StuList.size());
		
		tx.commit();
	}

}
