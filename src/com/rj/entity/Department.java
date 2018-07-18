package com.rj.entity;

import java.io.Serializable;
import java.util.Set;

/**
 * 
 * 部门实体类
 */
public class Department implements Serializable {

	private int did;// 编号

	private String dname;// 部门名称

	private String ddesc;// 部门描述

	private Set<Employee> employees;

	public Department() {
		super();
	}
	
	
	public Department(String dname, String ddesc) {
		super();
		this.dname = dname;
		this.ddesc = ddesc;
	}

	public Department(int did, String dname, String ddesc) {
		super();
		this.did = did;
		this.dname = dname;
		this.ddesc = ddesc;
	}


	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDdesc() {
		return ddesc;
	}

	public void setDdesc(String ddesc) {
		this.ddesc = ddesc;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
