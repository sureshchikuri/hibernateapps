package com.vcs.struts.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.Restrictions;

import com.vcs.hibernate.Floor;
import com.vcs.hibernate.Zone;

public class ZoneDaoImpl extends AbstractDaoImpl implements ZoneDaoNew {

	@Override
	public List floorData(Floor floor) {

		List<Floor> floorList =null;

		floorList = session.createCriteria(Floor.class).list();

		return floorList;
	}

	@Override
	public int getCount(int zoneId) {

		int count = 0;

		String qry = "SELECT COUNT(ZONE_ID) AS COUNT FROM ZONE";
		SQLQuery query = session.createSQLQuery(qry);
		query.addScalar("COUNT", Hibernate.INTEGER);

		count = (Integer) query.uniqueResult();

		return count;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Zone> search(int floorId,int zoneId, int startRow, int endRow) {

		List zoneList = null;

		if (floorId!=0 && zoneId != 0) {

			zoneList = (List) session.createCriteria(Zone.class).add(
					Restrictions.eq("zoneId", zoneId)).add(
							Restrictions.eq("floorId", floorId)).list();
		} else {

			zoneList = (List) session.createCriteria(Zone.class).add(
							Restrictions.eq("floor.floorId", floorId)).list();
			/*Criteria criteria=session.createCriteria(Zone.class);
			criteria.setFirstResult(startRow);
			criteria.setMaxResults(endRow);*/
		}
		return zoneList;
	}

	@Override
	public String zoneCreate(Zone zone) {

		String status=null;
		session.save(zone);
		
		status="zone Created successfully";
		
		return status;
	}

}
