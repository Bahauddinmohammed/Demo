package com.capgemini;

import java.util.Set;

public class HashCodeDemo {

	public static void main(String[] args) {

		Set<Employeel> set = new HashSet<Employeel>();

		Employee e1 = new Employee(101, "bahauddin", 700000);

		Employee e2 = new Employee(101, "bahauddin", 70000);
		Employee e3 = new Employee(101, "bahauddin", 700000);

		Employee e4 = new Employee(101, "bahauddin", 700000);

		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		System.out.println(set);
		
		
	}
}