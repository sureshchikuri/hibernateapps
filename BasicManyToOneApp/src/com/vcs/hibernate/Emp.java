package com.vcs.hibernate;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private String eno;
	private Dept dept;
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
	public Emp(String eno, Dept dept, String ename) {
		this.eno = eno;
		this.dept = dept;
		this.ename = ename;
	}

	// Property accessors

	public String getEno() {
		return this.eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}