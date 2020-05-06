package com.vcs.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "EMP", schema = "SYSTEM")
public class Emp implements java.io.Serializable {

	// Fields

	private String empNo;
	private Dept dept;
	private String empName;

	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** minimal constructor */
	public Emp(String empNo) {
		this.empNo = empNo;
	}

	/** full constructor */
	public Emp(String empNo, Dept dept, String empName) {
		this.empNo = empNo;
		this.dept = dept;
		this.empName = empName;
	}

	// Property accessors
	@Id
	@Column(name = "ENO", unique = true, nullable = false, length = 10)
	public String getEmpNo() {
		return this.empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DNO")
	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Column(name = "ENAME", length = 25)
	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}