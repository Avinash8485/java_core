package com;

public class Student {
	
	//Accessing public members in same class
	int age = 10;
	
	public static void study() {
		System.out.println("Studying java");
	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Age : "+s.age);
		
		study();     //Student.study();  [calling using class name]
		
	}

}
