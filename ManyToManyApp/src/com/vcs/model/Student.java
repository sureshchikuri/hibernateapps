package com.vcs.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer sno;
	private String sname;
	private Set courses = new HashSet(0);
	
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setCourses(Set courses) {
		this.courses = courses;
	}
	public Set getCourses() {
		return courses;
	}
	
}