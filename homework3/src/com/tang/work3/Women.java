package com.tang.work3;

public class Women extends Human{

	/*
	 * ����ĳ��󷽷�һ��Ҫʵ��
	 * */
	public void walk() {
		System.out.println("womenϲ����·�ķ�ʽ��women");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println(",women��Ҫ��ʳ����women");
	}

	/*
	 * ʵ�ֵĽӿڴ�ǳ��󷽷�Ҳһ��Ҫʵ��
	 * */
	public void code() {
		System.out.println("���ڱ���");
		
	}

	@Override
	public void work() {
		System.out.println("���ڹ���");
		
	}

}
