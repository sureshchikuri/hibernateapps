package com.vcs.model;

/**
 * Mbastudent entity. @author MyEclipse Persistence Tools
 */

public class Mbastudent implements java.io.Serializable {

	// Fields

	private Integer sno;
	private String sname;
	private String mbastream;

	// Constructors

	/** default constructor */
	public Mbastudent() {
	}

	/** minimal constructor */
	public Mbastudent(Integer sno) {
		this.sno = sno;
	}

	/** full constructor */
	public Mbastudent(Integer sno, String sname, String mbastream) {
		this.sno = sno;
		this.sname = sname;
		this.mbastream = mbastream;
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

	public String getMbastream() {
		return this.mbastream;
	}

	public void setMbastream(String mbastream) {
		this.mbastream = mbastream;
	}

}