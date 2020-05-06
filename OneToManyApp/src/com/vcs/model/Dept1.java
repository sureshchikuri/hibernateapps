package com.vcs.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept1 entity. @author MyEclipse Persistence Tools
 */

public class Dept1 implements java.io.Serializable {

	// Fields

	private Integer dno;
	private String dname;
	private Set emp1s ;

	// Constructors

	/** default constructor */
	public Dept1() {
	}

	/** minimal constructor */
	public Dept1(Integer dno) {
		this.dno = dno;
	}

	/** full constructor */
	public Dept1(Integer dno, String dname, Set emp1s) {
		this.dno = dno;
		this.dname = dname;
		this.emp1s = emp1s;
	}

	// Property accessors

	public Integer getDno() {
		return this.dno;
	}

	public void setDno(Integer dno) {
		this.dno = dno;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Set getEmp1s() {
		return this.emp1s;
	}

	public void setEmp1s(Set emp1s) {
		this.emp1s = emp1s;
	}

}