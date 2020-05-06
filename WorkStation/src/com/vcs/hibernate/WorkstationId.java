package com.vcs.hibernate;

/**
 * WorkstationId entity. @author MyEclipse Persistence Tools
 */

public class WorkstationId implements java.io.Serializable {

	// Fields

	private Short id;
	private String type;
	private Long extension;
	private String description;
	private Floor floor;
	private Zone zone;

	// Constructors

	/** default constructor */
	public WorkstationId() {
	}

	/** full constructor */
	public WorkstationId(Short id, String type, Long extension,
			String description, Floor floor, Zone zone) {
		this.id = id;
		this.type = type;
		this.extension = extension;
		this.description = description;
		this.floor = floor;
		this.zone = zone;
	}

	// Property accessors

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getExtension() {
		return this.extension;
	}

	public void setExtension(Long extension) {
		this.extension = extension;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WorkstationId))
			return false;
		WorkstationId castOther = (WorkstationId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null
						&& castOther.getType() != null && this.getType()
						.equals(castOther.getType())))
				&& ((this.getExtension() == castOther.getExtension()) || (this
						.getExtension() != null
						&& castOther.getExtension() != null && this
						.getExtension().equals(castOther.getExtension())))
				&& ((this.getDescription() == castOther.getDescription()) || (this
						.getDescription() != null
						&& castOther.getDescription() != null && this
						.getDescription().equals(castOther.getDescription())))
				&& ((this.getFloor() == castOther.getFloor()) || (this
						.getFloor() != null
						&& castOther.getFloor() != null && this.getFloor()
						.equals(castOther.getFloor())))
				&& ((this.getZone() == castOther.getZone()) || (this.getZone() != null
						&& castOther.getZone() != null && this.getZone()
						.equals(castOther.getZone())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getType() == null ? 0 : this.getType().hashCode());
		result = 37 * result
				+ (getExtension() == null ? 0 : this.getExtension().hashCode());
		result = 37
				* result
				+ (getDescription() == null ? 0 : this.getDescription()
						.hashCode());
		result = 37 * result
				+ (getFloor() == null ? 0 : this.getFloor().hashCode());
		result = 37 * result
				+ (getZone() == null ? 0 : this.getZone().hashCode());
		return result;
	}

}