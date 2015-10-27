package com.tang.work3;

public class Men extends Human implements Employee,Developer{

	@Override
	public void eat() {
		
		super.eat();
		System.out.println(",men需要的食物是men");
	}

	@Override
	public void code() {
		System.out.println("我在编代码");
		
	}

	@Override
	public void work() {
		System.out.println("我在工作");
		
	}

	@Override
	public void walk() {
		System.out.println("men喜欢走路的方式是men");
		
	}

}
