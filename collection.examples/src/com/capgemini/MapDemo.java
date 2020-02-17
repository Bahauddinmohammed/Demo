package com.capgemini;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map;
public class MapDemo {

	public static void main(String[] args) {
		Map<Employee, String> map = new TreeMap<Employee, String>();

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		map.put(e1, null);
		map.put(e2, null);
		map.put(e3, null);
		map.put(e4, null);
		System.out.println(map);
	}

}
