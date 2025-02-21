package com;

class Student {
	Student(String b) {
		this(22);
		System.out.println("Name : "+ b);
	}
	Student(int a){
		this(6.1);
		System.out.println("Age :"+a);
		
	}
	Student(double c) {
		//this("avinash");  --- if we do so then recursion chaining will occur
		System.out.println("height : "+c);
	}
	

	public static void main(String[] args) {
		Student c = new Student("Avinash");
		
	}

}
