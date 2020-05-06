package com.vcs.struts.dao;

public class DaoFactory {
	
	private static FloorDaoNew floorDaoNew=null;
	private static ZoneDaoNew zoneDaoNew=null;
	private static WorkStationDao workStationDao=null;
	
	public static FloorDaoNew getFloorDaoNew() {
		if(floorDaoNew==null){
			floorDaoNew=new FloorDaoImpl();
		}
		return floorDaoNew;
	}
	public static void setFloorDaoNew(FloorDaoNew floorDaoNew) {
		DaoFactory.floorDaoNew = floorDaoNew;
	}
	public static ZoneDaoNew getZoneDaoNew() {
		
		if(zoneDaoNew==null){
			zoneDaoNew=new ZoneDaoImpl();
		}
		return zoneDaoNew;
	}
	public static void setZoneDaoNew(ZoneDaoNew zoneDaoNew) {
		DaoFactory.zoneDaoNew = zoneDaoNew;
	}
	public static void setWorkStationDao(WorkStationDao workStationDao) {
		DaoFactory.workStationDao = workStationDao;
	}
	public static WorkStationDao getWorkStationDao() {
		if(workStationDao==null){
			workStationDao=new WorkStationDaoImpl();
		}
		return workStationDao;
	}

}
