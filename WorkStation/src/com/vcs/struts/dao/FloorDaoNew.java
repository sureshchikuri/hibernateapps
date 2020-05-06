package com.vcs.struts.dao;

import java.util.List;

import com.vcs.hibernate.Floor;

public interface FloorDaoNew extends AbstractDao {

	void createFloor(Floor floor);
	
	boolean isFloorExist(int floorId);

	List<Floor> searchFloor(int floorId, int startRow, int endRow);

	int getCount(int floorId);

}
