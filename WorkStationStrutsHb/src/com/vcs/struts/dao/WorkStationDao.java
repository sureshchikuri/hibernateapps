package com.vcs.struts.dao;

import java.util.List;

import com.vcs.hibernate.Workstation;
import com.vcs.hibernate.Workstationlov;
import com.vcs.hibernate.Zone;

public interface WorkStationDao extends AbstractDao{

	List getFloorIdList(Zone zone);

	List getTypeList(Workstationlov workstationlov);

	String getZoneIdList(Zone zone);

	String create(Workstation workstation);

	List search(Workstation workstation);

}
