package com.vcs.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Student1 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "STUDENT1", schema = "SYSTEM")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="STU_DISC",discriminatorType=DiscriminatorType.STRING)
public abstract class Student1 implements java.io.Serializable {

	// Fields

	private String studentNo;
	private String studentName;

	
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

	
}