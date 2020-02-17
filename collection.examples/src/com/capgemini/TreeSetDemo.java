package com.capgemini;

import java.util.Set;
import java.util.TreeSet;


public class TreeSetDemo {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();

		set.add("a");
		set.add("b");
		set.add("c");

		System.out.println(set);

	}
}