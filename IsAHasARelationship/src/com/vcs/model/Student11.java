package com.vcs.model;

/**
 * Student11 entity. @author MyEclipse Persistence Tools
 */

public class Student11 implements java.io.Serializable {

	// Fields

	private Integer StudentNo;
	private String StudentName;
	
	private Address address;
	public Integer getStudentNo() {
		return StudentNo;
	}
	public void setStudentNo(Integer studentNo) {
		StudentNo = studentNo;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student11 [StudentName=" + StudentName + ", StudentNo="
				+ StudentNo + ", address=" + address + "]";
	}

	
}