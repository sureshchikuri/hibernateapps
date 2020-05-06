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

	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** minimal constructor */
	public Dept(String dno) {
		this.dno = dno;
	}

	/** full constructor */


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

	

}