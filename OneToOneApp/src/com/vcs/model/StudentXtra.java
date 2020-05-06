package com.vcs.model;

/**
 * StudentXtra entity. @author MyEclipse Persistence Tools
 */

public class StudentXtra implements java.io.Serializable {

	// Fields

	private Integer sno;
	private Student student;
	private String sage;

	// Constructors

	/** default constructor */
	public StudentXtra() {
	}

	/** minimal constructor */
	public StudentXtra(Integer sno, Student student) {
		this.sno = sno;
		this.student = student;
	}

	/** full constructor */
	public StudentXtra(Integer sno, Student student, String sage) {
		this.sno = sno;
		this.student = student;
		this.sage = sage;
	}

	// Property accessors

	public Integer getSno() {
		return this.sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getSage() {
		return this.sage;
	}

	public void setSage(String sage) {
		this.sage = sage;
	}

}