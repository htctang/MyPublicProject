package com.tang.work3;

public class Men extends Human implements Employee,Developer{

	@Override
	public void eat() {
		
		super.eat();
		System.out.println(",men��Ҫ��ʳ����men");
	}

	@Override
	public void code() {
		System.out.println("���ڱ����");
		
	}

	@Override
	public void work() {
		System.out.println("���ڹ���");
		
	}

	@Override
	public void walk() {
		System.out.println("menϲ����·�ķ�ʽ��men");
		
	}

}
