package com.capgemini;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	Set<Employee> set = new HashSet<Employee>();

	public Set<Employee> getAll() {

		set.add(new Employee(1));
		set.add(new Employee(102));
		set.add(new Employee(103));

		return set;

	}

	public static void main(String[] args) {
		SetDemo word = new SetDemo();
		word.getSet();
		Set<String> String = word.getSet();
		System.out.println(String);

	}
}
