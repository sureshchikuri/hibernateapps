package com.vcs.struts.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.Restrictions;

import com.vcs.hibernate.Floor;

public class FloorDaoImpl extends AbstractDaoImpl implements FloorDaoNew {

	private static Logger log=Logger.getLogger(FloorDaoImpl.class);

	@Override
	public void createFloor(Floor floor) {

		try{
		log.info("floordaoImpl started");
		getSession().save(floor);
		log.debug("floor"+floor);
		}catch (Exception e) {
			//throw new FloorDaoImplException("FDI ERROR"+e);
			log.error("floorInsertion exception"+e);
		}
	}

	@Override
	public boolean isFloorExist(int floorId) {

		
		log.info("isFloorExist metod started");
		boolean value = true;
		List floorList =null;

		try{
		floorList = getSession().createCriteria(Floor.class).add(
				Restrictions.eq("floorId", floorId)).list();

		log.debug("isfloorexist values"+floorId);
		}catch (Exception e) {
		log.error("Isfloorexist insertion exception"+e);
		}
		if (floorList.size() < 1) {
			value = false;
		}
		return value;
	}

	@Override
	public List<Floor> searchFloor(int floorId, int startRow, int endRow) {

		
		log.info("floorsearch started");
		List floorList = null;

		if (floorId != 0) {

			try{
			floorList = (List) getSession().createCriteria(Floor.class).add(
					Restrictions.eq("floorId", floorId)).list();
			log.debug("Search floor values "+floorId);
			}catch (Exception e) {
				log.error("floor  object"+floorId);
			}
		} else {

			try{
			String qry = "SELECT A.* FROM(SELECT ROWNUM AS ROW_NUM,F.* FROM(SELECT FLOOR_ID,FLOOR_NAME,FLOOR_DESC FROM FLOOR) F)A WHERE ROW_NUM BETWEEN ? AND ?";
			SQLQuery query = getSession().createSQLQuery(qry);
			query.setInteger(0, startRow);
			query.setInteger(1, endRow);
			query.addEntity(Floor.class);

			floorList = query.list();
			
			log.debug("floor value"+floorId);
			}catch (Exception e) {
				log.error("floorSearch exception"+floorId);
			}
		}
		return floorList;
	}

	@Override
	public int getCount(int floorId) {
		
		String qry = "SELECT COUNT(FLOOR_ID) AS COUNT FROM FLOOR";
		SQLQuery query = getSession().createSQLQuery(qry);
		query.addScalar("COUNT", Hibernate.INTEGER);

		int count = (Integer) query.uniqueResult();

		return count;
	}

}
