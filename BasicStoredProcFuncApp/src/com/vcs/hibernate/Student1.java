package com.vcs.hibernate;

import java.math.BigDecimal;

/**
 * Student1 entity. @author MyEclipse Persistence Tools
 */

public class Student1 implements java.io.Serializable {

	// Fields

	private BigDecimal sno;
	private String sname;

	// Constructors

	/** default constructor */
	public Student1() {
	}

	/** minimal constructor */
	public Student1(BigDecimal sno) {
		this.sno = sno;
	}

	/** full constructor */
	public Student1(BigDecimal sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	// Property accessors

	public BigDecimal getSno() {
		return this.sno;
	}

	public void setSno(BigDecimal sno) {
		this.sno = sno;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}