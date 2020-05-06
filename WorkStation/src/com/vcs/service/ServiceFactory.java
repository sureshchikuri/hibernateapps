package com.vcs.service;

public class ServiceFactory {
	
	private static FloorService floorService=null;
	private static ZoneService zoneService=null;
	
	public static FloorService getFloorService() {
		
		if(floorService==null){
			floorService=new FloorServiceImpl();
		}
		return floorService;
	}
	public static void setFloorService(FloorService floorService) {
		ServiceFactory.floorService = floorService;
	}
	public static ZoneService getZoneService() {
		if(zoneService==null){
			zoneService=new ZoneServiceImpl();
		}
		return zoneService;
	}
	public static void setZoneService(ZoneService zoneService) {
		ServiceFactory.zoneService = zoneService;
	}
	
	

}
