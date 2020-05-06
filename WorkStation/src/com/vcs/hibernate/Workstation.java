package com.vcs.hibernate;

/**
 * Workstation entity. @author MyEclipse Persistence Tools
 */

public class Workstation implements java.io.Serializable {

	// Fields

	private WorkstationId id;
	private Floor floor;
	private Zone zone;

	// Constructors

	/** default constructor */
	public Workstation() {
	}

	/** minimal constructor */
	public Workstation(WorkstationId id) {
		this.id = id;
	}

	/** full constructor */
	public Workstation(WorkstationId id, Floor floor, Zone zone) {
		this.id = id;
		this.floor = floor;
		this.zone = zone;
	}

	// Property accessors

	public WorkstationId getId() {
		return this.id;
	}

	public void setId(WorkstationId id) {
		this.id = id;
	}

	public Floor getFloor() {
		return this.floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}

	public Zone getZone() {
		return this.zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

}