package com.vcs.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Mcastudent entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "MCASTUDENT", schema = "SYSTEM")
public class Mcastudent implements java.io.Serializable {

	// Fields

	private String studentNo;
	private String studentName;
	private String mcastream;

	// Constructors

	/** default constructor */
	public Mcastudent() {
	}

	/** minimal constructor */
	public Mcastudent(String studentNo) {
		this.studentNo = studentNo;
	}

	/** full constructor */
	public Mcastudent(String studentNo, String studentName, String mcastream) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.mcastream = mcastream;
	}

	// Property accessors
	@Id
	@Column(name = "SNO", unique = true, nullable = false, length = 10)
	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	@Column(name = "SNAME", length = 25)
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Column(name = "MCASTREAM", length = 25)
	public String getMcastream() {
		return this.mcastream;
	}

	public void setMcastream(String mcastream) {
		this.mcastream = mcastream;
	}

}