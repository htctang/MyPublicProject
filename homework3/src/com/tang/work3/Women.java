package com.tang.work3;

public class Women extends Human{

	/*
	 * 父类的抽象方法一定要实现
	 * */
	public void walk() {
		System.out.println("women喜欢走路的方式是women");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println(",women需要的食物是women");
	}

	/*
	 * 实现的接口达非抽象方法也一定要实现
	 * */
	public void code() {
		System.out.println("我在编码");
		
	}

	@Override
	public void work() {
		System.out.println("我在工作");
		
	}

}
