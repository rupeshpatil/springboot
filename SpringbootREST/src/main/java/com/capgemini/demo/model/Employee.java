package com.capgemini.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {
	
	@Id
	private int empid;
	private String empname;
	private String gender;
	private String designation;
		

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", gender=" + gender + ", designation="
				+ designation + "]";
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}

	
	

}
