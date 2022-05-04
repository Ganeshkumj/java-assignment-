package com.citiustech.eis.bean;

public class Employee {
	int id;
	String name;
	int salary;
	String designation;
	String insurancescheme;
	String insdata;
	public Employee(int id, String name, int salary, String designation, String insurancescheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insurancescheme = insurancescheme;
	}
	public Employee(){}
	public int getId() {
		return id;
	}
	public void setinsurancedata(String insdata)
	{
		this.insdata=insdata;
	}
	public String getinsurancedata()
	{
		return insdata;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsurancescheme() {
		return insurancescheme;
	}
	public void setInsurancescheme(String insurancescheme) {
		this.insurancescheme = insurancescheme;
	}
	
}
