package com.vcs.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.vcs.hibernate.Student1;
import com.vcs.util.HibernateUtil;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		
		Criteria criteria=session.createCriteria(Student1.class);

		ProjectionList list=Projections.projectionList();
		
		Projection projection=Projections.count("sname");
		Projection projection2=Projections.avg("sno");
		
		list.add(projection);
		list.add(projection2);
		
		criteria.setProjection(list);
		
		List StuList=criteria.list();
		
		System.out.println(StuList.size());
		
		tx.commit();

	}

}
