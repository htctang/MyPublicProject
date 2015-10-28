package com.tang.work3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Men men = new Men();
		men.eat();
		men.walk();
		men.work();
		men.code();
		
		Women women = new Women();
		women.eat();
		women.walk();
		women.work();
		women.code();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		ArrayList<Human> mens = new ArrayList<Human>();
		Men menplus =  new Men();
		mens.add(menplus);
		Women womenplus = new Women();
		mens.add(womenplus);
		for(Human temp: mens){
			temp.eat();
			temp.walk();
			temp.work();
			temp.code();
		}
		


	}

}
