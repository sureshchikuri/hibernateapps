package com.vcs.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vcs.hibernate.Floor;
import com.vcs.struts.dao.DaoFactory;
import com.vcs.struts.dao.FloorDaoNew;
import com.vcs.struts.util.HibernateUtil;

public class FloorServiceImpl implements FloorService {

	Session session=null;
	Transaction tx=null;
	FloorDaoNew floorDaoNew=null;
	
	@Override
	public String createFloor(Floor floor) {
		
		session=HibernateUtil.getSession();
		tx=session.beginTransaction();
		floorDaoNew=DaoFactory.getFloorDaoNew();
		floorDaoNew.setSession(session);
		String status=null;
		
		if(isFloorExist(floor.getFloorId())){
			status="floor already exist";
		}else{
		floorDaoNew.createFloor(floor);
		tx.commit();
		
		status="floor created";
		}
		return status;
	}

	@Override
	public boolean isFloorExist(int floorId) {
		
		session=HibernateUtil.getSession();
		tx=session.beginTransaction();
		floorDaoNew=DaoFactory.getFloorDaoNew();
		floorDaoNew.setSession(session);
		boolean value=floorDaoNew.isFloorExist(floorId);
		return value;
	}

	@Override
	public int getCount(int floorId) {
		
		session=HibernateUtil.getSession();
		tx=session.beginTransaction();
		floorDaoNew=DaoFactory.getFloorDaoNew();
		floorDaoNew.setSession(session);
		
		int count=floorDaoNew.getCount(floorId);
		
		tx.commit();
		
		return count;
	}

	@Override
	public List<Floor> search(int floorId, int startRow, int endRow) {
		
		session=HibernateUtil.getSession();
		tx=session.beginTransaction();
		floorDaoNew=DaoFactory.getFloorDaoNew();
		floorDaoNew.setSession(session);
		
		List<Floor> floorList=floorDaoNew.searchFloor(floorId,startRow,endRow);
		tx.commit();
		
		return floorList;
	}



	
}
