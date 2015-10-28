package com.tang.test;

public class Mangr extends Employee{

	private Integer AddSalary=3000;
	public Integer getSalary() {
		return super.getSalary()+AddSalary;
	}
	public void SetAddSalarly(Integer addSInteger){
		this.AddSalary = addSInteger;
	}
	
}
