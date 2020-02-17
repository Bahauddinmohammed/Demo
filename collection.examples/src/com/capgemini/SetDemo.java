package com.capgemini;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	Set<String> set = new HashSet<String>();
	public Set<String >getSet() {
    set.add(new Employee(1));
    set.add();
    set.add("c");
	set.add("D");
    return set;
    	
    }

	public static void main(String[] args) {
    SetDemo word = new SetDemo();
    word.getSet();
    Set<String> String = word.getSet();
    System.out.println(String);
    
    
	}
}
