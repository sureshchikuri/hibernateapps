package com.vcs.pojo;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "DEPT", schema = "SYSTEM")
public class Dept implements java.io.Serializable {

	// Fields

	private String deptNo;
	private String deptName;
	private Set<Emp> emps = new HashSet<Emp>(0);

	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** minimal constructor */
	public Dept(String deptNo) {
		this.deptNo = deptNo;
	}

	/** full constructor */
	public Dept(String deptNo, String deptName, Set<Emp> emps) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.emps = emps;
	}

	// Property accessors
	@Id
	@Column(name = "DNO", unique = true, nullable = false, length = 10)
	public String getDeptNo() {
		return this.deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	@Column(name = "DNAME", length = 25)
	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "dept")
	public Set<Emp> getEmps() {
		return this.emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

}