package com.tang.test;

public class Employee {
	private String name=null;
	private Integer money = 0;;
	private String part = null;
	private Integer age =0;
	
	public void SetName(String name){
		this.name=name;
	}
	public void SetMoney(Integer money){
		this.money=money;
	}
	public void SetPart(String part){
		this.part=part;
	}
	public void SetAge(Integer age){
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public String GetMoney(){
		return ""+money*1.7;
	}
	public String GetPart(){
		return part;
	}
	public Integer getSalary(){
		return money+20*age;
	}
	public Integer GetAge(){
		return age;
	}
	
}
