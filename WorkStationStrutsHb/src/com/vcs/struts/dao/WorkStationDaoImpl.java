package com.vcs.struts.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import com.vcs.hibernate.Workstation;
import com.vcs.hibernate.Workstationlov;
import com.vcs.hibernate.Zone;

public class WorkStationDaoImpl extends AbstractDaoImpl implements
		WorkStationDao {

	@Override
	public List getFloorIdList(Zone zone) {

		List floorIdList = null;

		floorIdList = getSession().createCriteria(Zone.class).list();

		return floorIdList;
	}

	@Override
	public List getTypeList(Workstationlov workstationlov) {

		List typeList = null;

		typeList = getSession().createCriteria(Workstationlov.class).add(Restrictions.eq("type", "type")).list();
		return typeList;
	}

	@Override
	public String getZoneIdList(Zone zone) {

		List zoneIdList = null;
		String zoneList=null;

		zoneIdList = getSession().createCriteria(Zone.class).list();
		
		StringBuffer sb=new StringBuffer();
		
		
		for(int i=0;i<zoneIdList.size();i++){
			
			zone=(Zone) zoneIdList.get(i);
			
			sb.append(zone.getZoneId());
			sb.append(",");
		}
		zoneList=sb.toString();
		return zoneList;

	}

	@Override
	public String create(Workstation workstation) {

		String status = null;

		getSession().save(workstation);

		return status;
	}

	@Override
	public List search(Workstation workstation) {

		List workstationSearchList = null;

		workstationSearchList = getSession().createCriteria(Workstation.class)
				.list();

		return workstationSearchList;
	}

}
