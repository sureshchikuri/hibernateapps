package com.vcs.hibernate;

public class Floor implements java.io.Serializable {

	// Fields

	private int floorId;
	private String floorName;
	private String floorDesc;
	private Floorxtra floorxtra;
	
	public int getFloorId() {
		return floorId;
	}
	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}
	public String getFloorName() {
		return floorName;
	}
	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
	public String getFloorDesc() {
		return floorDesc;
	}
	public void setFloorDesc(String floorDesc) {
		this.floorDesc = floorDesc;
	}
	public Floorxtra getFloorxtra() {
		return floorxtra;
	}
	public void setFloorxtra(Floorxtra floorxtra) {
		this.floorxtra = floorxtra;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
}