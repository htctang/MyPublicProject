package com.tang.work3;

public abstract class Human implements Employee,Developer{
public void eat(){
	System.out.print("人需要食物");
}
public abstract void walk();
}
