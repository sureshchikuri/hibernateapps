package com.vcs.hibernate;

/**
 * Student1 entity. @author MyEclipse Persistence Tools
 */

public class Student1 implements java.io.Serializable {

	// Fields

	private Long sno;
	private String sname;

	// Constructors

	/** default constructor */
	public Student1() {
	}

	/** minimal constructor */
	public Student1(Long sno) {
		this.sno = sno;
	}

	/** full constructor */
	public Student1(Long sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	// Property accessors

	public Long getSno() {
		return this.sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}