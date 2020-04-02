package com.jdbc.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Employee {

	private int id;
	private String name;
	private String orgName;
	private int salary;
	
	
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String orgName, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.orgName = orgName;
		this.salary = salary;
	}

	public int getId() {
		return id;
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

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", orgName=" + orgName + ", salary=" + salary + "]";
	}
	
	
	
}
