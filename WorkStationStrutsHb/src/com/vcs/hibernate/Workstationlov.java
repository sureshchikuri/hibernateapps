package com.vcs.hibernate;

/**
 * Workstationlov entity. @author MyEclipse Persistence Tools
 */

public class Workstationlov implements java.io.Serializable {

	// Fields

	private int id;
	private String key;
	private String value;
	private String type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Workstationlov [id=" + id + ", key=" + key + ", type=" + type
				+ ", value=" + value + "]";
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}


}