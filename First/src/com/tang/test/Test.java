package com.tang.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Employee> datas = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			Employee e = new Employee();

			Employee e1 = new Mangr();
			Employee e2 = new Worker();

			e.SetName("boy" + i);
			e.SetMoney(129);
			e.SetPart("wahaha" + i);
			datas.add(e);

			e1.SetName("Tom" + i);
			e1.SetMoney(129);
			e1.SetPart("weeee" + i);
		
			datas.add(e1);

			e2.SetName("Henoy" + i);
			e2.SetMoney(129);
			e2.SetPart("weeee" + i);
			datas.add(e2);

		}
		for (Employee e : datas) {
			System.out.println("the name is " + e.getName());
			System.out.println("the money is " + e.GetMoney());
			System.out.println("the part is " + e.GetPart());

			System.out.println("the Salary is " + e.getSalary());

		}

	}
}
