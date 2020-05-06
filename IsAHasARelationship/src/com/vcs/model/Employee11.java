package com.vcs.model;

/**
 * Employee11 entity. @author MyEclipse Persistence Tools
 */

public class Employee11 implements java.io.Serializable {

	// Fields

	private Integer EmployeeNo;
	private String EmployeeName;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Integer getEmployeeNo() {
		return EmployeeNo;
	}
	public void setEmployeeNo(Integer employeeNo) {
		EmployeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee11 [EmployeeName=" + EmployeeName + ", EmployeeNo="
				+ EmployeeNo + ", address=" + address + "]";
	}
	
}