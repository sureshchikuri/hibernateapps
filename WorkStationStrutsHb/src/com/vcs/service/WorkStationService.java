package com.vcs.service;

import java.util.List;

import com.vcs.hibernate.Workstation;
import com.vcs.hibernate.Workstationlov;
import com.vcs.hibernate.Zone;

public interface WorkStationService {

	List getTypeList(Workstationlov workstationlov);

	List getFloorIdList(Zone zone);

	String getZoneIdList(Zone zone);

	String create(Workstation workstation);

	List search(Workstation workstation);

}
