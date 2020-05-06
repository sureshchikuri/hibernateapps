package com.vcs.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.hibernate.Floor;
import com.vcs.hibernate.Zone;
import com.vcs.struts.dao.DaoFactory;
import com.vcs.struts.dao.ZoneDaoNew;
import com.vcs.struts.util.HibernateUtil;

public class ZoneServiceImpl implements ZoneService {

	Session session=null;
	Transaction tx=null;
	ZoneDaoNew zoneDaoNew=null;
	
	
	@Override
	public List floorData(Floor floor) {

		session=HibernateUtil.getSession();
		tx=session.beginTransaction();
		zoneDaoNew=DaoFactory.getZoneDaoNew();
		zoneDaoNew.setSession(session);
		List zoneList=null;
		
		zoneList=zoneDaoNew.floorData(floor);
		
		return zoneList;
	}

	@Override
	public int getCount(int zoneId) {

		session=HibernateUtil.getSession();
		tx=session.beginTransaction();
		zoneDaoNew=DaoFactory.getZoneDaoNew();
		zoneDaoNew.setSession(session);
		int count=0;
		
		count=zoneDaoNew.getCount(zoneId);
		
		return count;
	}

	@Override
	public List search(int floorId,int zoneId, int startRow, int endRow) {

		session=HibernateUtil.getSession();
		tx=session.beginTransaction();
		zoneDaoNew=DaoFactory.getZoneDaoNew();
		zoneDaoNew.setSession(session);
		List searchList=null;
		
		searchList=zoneDaoNew.search(floorId,zoneId,startRow,endRow);
		
		return searchList;
	}

	@Override
	public String zoneCreate(Zone zone) {

		session=HibernateUtil.getSession();
		tx=session.beginTransaction();
		zoneDaoNew=DaoFactory.getZoneDaoNew();
		zoneDaoNew.setSession(session);
		String status=null;
		
		status=zoneDaoNew.zoneCreate(zone);
		
		tx.commit();
		
		return status;
	}

}
