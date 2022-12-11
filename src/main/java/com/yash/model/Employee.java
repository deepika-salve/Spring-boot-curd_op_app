package com.yash.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="emp_id")
	private int empid;
	
	@Column(name="emp_name")
	private String name;
	
	@Column(name="emp_designation")
	private String designation;
	
	@Column(name="emp_salary")
	private int salary;
	
	@Column(name="emp_address")
	private String address;

	

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



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", address=" + address + "]";
	}
	
}
