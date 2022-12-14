package com.training.spring;

public class Employee {
private int empId;
private String firstName;
private String lastName;
private Laptop laptop;
public Laptop getLaptop() {
	return laptop;
}
public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}
public Employee(int empId, String firstName, String lastName) {
	super();
	this.empId = empId;
	this.firstName = firstName;
	this.lastName = lastName;
}
public Employee() {
	super();
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + "," + laptop
			+ "]";
}
}