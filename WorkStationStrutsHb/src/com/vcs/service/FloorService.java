package com.vcs.service;

import java.util.List;

import com.vcs.hibernate.Floor;

public interface FloorService {

	String createFloor(Floor floor);

	List<Floor> search(int floorId, int startRow, int endRow);

	int getCount(int floorId);

	boolean isFloorExist(int floorId);
	
}
