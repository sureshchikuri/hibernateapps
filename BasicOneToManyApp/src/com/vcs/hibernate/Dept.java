package com.vcs.hibernate;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private String dno;
	private String dname;
	private Set emps = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** minimal constructor */
	public Dept(String dno) {
		this.dno = dno;
	}

	/** full constructor */
	public Dept(String dno, String dname, Set emps) {
		this.dno = dno;
		this.dname = dname;
		this.emps = emps;
	}

	// Property accessors

	public String getDno() {
		return this.dno;
	}

	public void setDno(String dno) {
		this.dno = dno;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Set getEmps() {
		return this.emps;
	}

	public void setEmps(Set emps) {
		this.emps = emps;
	}

}