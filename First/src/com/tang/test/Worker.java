package com.tang.test;

public class Worker extends Employee {

	private Integer AddSalary=1000;
	public Integer getSalary() {
		return super.getSalary()+AddSalary;
	}
	public void SetAddSalarly(Integer addSInteger){
		this.AddSalary = addSInteger;
	}

}
