package com.training.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name="employee3")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empid;
	
	private String empName;
	
	private double empSal;
	
	
	public Employee(int empid, String empName, double empSal) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
}
