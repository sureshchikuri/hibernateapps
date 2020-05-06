package com.vcs.struts.dao;

import java.util.List;

import com.vcs.hibernate.Floor;
import com.vcs.hibernate.Zone;

public interface ZoneDaoNew extends AbstractDao{

	String zoneCreate(Zone zone);

	List search(int zoneId, int startRow, int endRow, int floorId);

	List floorData(Floor floor);

	int getCount(int zoneId);

}
