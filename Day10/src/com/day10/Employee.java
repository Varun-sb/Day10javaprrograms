package com.day10;

import java.io.Serializable;

public class Employee implements Serializable{
	private int empid;
	private String name;
	private int deptNo;
	
	
	
	public Employee() {
		
	}
	
	public Employee(int empid, String name, int deptNo) {
	
		this.empid = empid;
		this.name = name;
		this.deptNo = deptNo;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", deptNo=" + deptNo + "]";
	}
	

}
