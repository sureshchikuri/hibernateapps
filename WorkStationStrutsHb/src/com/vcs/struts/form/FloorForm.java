/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.vcs.struts.form;

import org.apache.struts.validator.ValidatorActionForm;

public class FloorForm extends ValidatorActionForm {
	

	private static final long serialVersionUID = 1L;

	/** floorName property */
	private String floorName;

	/** floorDesc property */
	private String floorDesc;

	/** floorNo property */
	private String floorId;

	/** 
	 * Returns the floorName.
	 * @return String
	 */
	public String getFloorName() {
		return floorName;
	}

	/** 
	 * Set the floorName.
	 * @param floorName The floorName to set
	 */
	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}

	/** 
	 * Returns the floorDesc.
	 * @return String
	 */
	public String getFloorDesc() {
		return floorDesc;
	}

	/** 
	 * Set the floorDesc.
	 * @param floorDesc The floorDesc to set
	 */
	public void setFloorDesc(String floorDesc) {
		this.floorDesc = floorDesc;
	}

	/** 
	 * Returns the floorNo.
	 * @return String
	 */
	public String getFloorId() {
		return floorId;
	}

	/** 
	 * Set the floorNo.
	 * @param floorNo The floorNo to set
	 */
	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}
}