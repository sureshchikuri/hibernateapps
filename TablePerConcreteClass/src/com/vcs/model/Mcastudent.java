package com.vcs.model;

/**
 * Mcastudent entity. @author MyEclipse Persistence Tools
 */

public class Mcastudent implements java.io.Serializable {

	// Fields

	private Integer sno;
	private String sname;
	private String mcastream;

	// Constructors

	/** default constructor */
	public Mcastudent() {
	}

	/** minimal constructor */
	public Mcastudent(Integer sno) {
		this.sno = sno;
	}

	/** full constructor */
	public Mcastudent(Integer sno, String sname, String mcastream) {
		this.sno = sno;
		this.sname = sname;
		this.mcastream = mcastream;
	}

	// Property accessors

	public Integer getSno() {
		return this.sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getMcastream() {
		return this.mcastream;
	}

	public void setMcastream(String mcastream) {
		this.mcastream = mcastream;
	}

}