package com.vcs.hibernate;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private String eno;
	private String ename;

	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** minimal constructor */
	public Emp(String eno) {
		this.eno = eno;
	}

	/** full constructor */
	
	// Property accessors

	public String getEno() {
		return this.eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}