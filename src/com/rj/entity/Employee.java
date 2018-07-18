package com.rj.entity;

import java.io.Serializable;

/**
 * 员工实体类
 */
public class Employee implements Serializable {

	private int eid;// 员工编号

	private String ename;// 员工姓名

	private String sex;// 员工性别

	private int age;// 员工年龄

	// 在多方定义一方的引用
	private Department department;

	public Employee() {
		super();
	}

	public Employee(int eid, String ename, String sex, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.age = age;
	}

	public Employee(String ename, String sex, int age) {
		super();
		this.ename = ename;
		this.sex = sex;
		this.age = age;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
