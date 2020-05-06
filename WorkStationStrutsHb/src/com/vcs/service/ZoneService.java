package com.vcs.service;

import java.util.List;

import com.vcs.hibernate.Floor;
import com.vcs.hibernate.Zone;

public interface ZoneService {

	List floorData(Floor floor);

	String zoneCreate(Zone zone);

	List search(int zoneId, int startRow, int endRow, int floorId);

	int getCount(int zoneId);

}
