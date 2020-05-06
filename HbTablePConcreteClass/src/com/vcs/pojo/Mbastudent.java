package com.vcs.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Mbastudent entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "MBASTUDENT", schema = "SYSTEM")
public class Mbastudent implements java.io.Serializable {

	// Fields

	private String studentNo;
	private String studentName;
	private String mbastream;

	// Constructors

	/** default constructor */
	public Mbastudent() {
	}

	/** minimal constructor */
	public Mbastudent(String studentNo) {
		this.studentNo = studentNo;
	}

	/** full constructor */
	public Mbastudent(String studentNo, String studentName, String mbastream) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.mbastream = mbastream;
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

	@Column(name = "MBASTREAM", length = 25)
	public String getMbastream() {
		return this.mbastream;
	}

	public void setMbastream(String mbastream) {
		this.mbastream = mbastream;
	}

}