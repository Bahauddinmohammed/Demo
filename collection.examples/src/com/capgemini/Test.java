package com.capgemini;

public class Test {
public static void main(String[] args) {
	
	
	
	
	Student stud = new Student();
	
	stud.setMarks(50);
	
	if(stud.getMarks()<70);
	try {
		throw new StudentFailException("Marks are low");
	}catch (StudentsFailsException e) {
		e.printStackTrace();
	}
	
}
}