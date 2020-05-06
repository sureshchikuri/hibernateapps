package com.vcs.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.hibernate.Workstation;
import com.vcs.hibernate.Workstationlov;
import com.vcs.hibernate.Zone;
import com.vcs.struts.dao.DaoFactory;
import com.vcs.struts.dao.WorkStationDao;
import com.vcs.struts.util.HibernateUtil;

public class WorkStationServiceImpl implements WorkStationService {

	Session session=null;
	Transaction tx=null;
	WorkStationDao workStationDao=null;
	
	String status=null;
	
	@Override
	public List getFloorIdList(Zone zone) {
	
		session=HibernateUtil.getSession();
		tx=session.beginTransaction();
		workStationDao=DaoFactory.getWorkStationDao();
		workStationDao.setSession(session);
		
		List floorIdList=null;
		floorIdList=workStationDao.getFloorIdList(zone);
		
		return floorIdList;
	}

	@Override
	public List getTypeList(Workstationlov workstationlov) {

		session=HibernateUtil.getSession();
		tx=session.beginTransaction();
		workStationDao=DaoFactory.getWorkStationDao();
		workStationDao.setSession(session);
		
		List typeList=null;
		
		typeList=workStationDao.getTypeList(workstationlov);
		return typeList;
	}

	@Override
	public String getZoneIdList(Zone zone) {

		session=HibernateUtil.getSession();
		tx=session.beginTransaction();
		
		workStationDao=DaoFactory.getWorkStationDao();
		workStationDao.setSession(session);
		
		String zoneIdList=null;
		
		zoneIdList=workStationDao.getZoneIdList(zone);
		return zoneIdList;
	}

	@Override
	public String create(Workstation workstation) {

		session=HibernateUtil.getSession();
		tx=session.beginTransaction();
		workStationDao=DaoFactory.getWorkStationDao();
		workStationDao.setSession(session);
		String status=null;
		status=workStationDao.create(workstation);
		tx.commit();
		return status;
	}

	@Override
	public List search(Workstation workstation) {

		List workstationSearchList=null;
		
		session=HibernateUtil.getSession();
		tx=session.beginTransaction();
		workStationDao=DaoFactory.getWorkStationDao();
		workStationDao.setSession(session);
		
		workstationSearchList=workStationDao.search(workstation);
		return workstationSearchList;
	}

}
