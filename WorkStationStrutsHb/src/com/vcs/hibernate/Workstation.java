package com.vcs.hibernate;

/**
 * Workstation entity. @author MyEclipse Persistence Tools
 */

public class Workstation implements java.io.Serializable {

	// Fields

	private Integer id;
	private String type;
	private Integer extension;
	private String description;
	private Integer floorId;
	private Integer zoneId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getExtension() {
		return extension;
	}
	public void setExtension(Integer extension) {
		this.extension = extension;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getFloorId() {
		return floorId;
	}
	public void setFloorId(Integer floorId) {
		this.floorId = floorId;
	}
	public Integer getZoneId() {
		return zoneId;
	}
	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}
	@Override
	public String toString() {
		return "Workstation [description=" + description + ", extension="
				+ extension + ", floorId=" + floorId + ", id=" + id + ", type="
				+ type + ", zoneId=" + zoneId + "]";
	}
	
	
}