package org;

class Student {
	int age;
	String name;
	Student(int age){
		this.age=age;
	}
	Student(int age,String name) {
		this(age);
		this.name =name;
	}
	public static void main(String[] args) {
		Student s = new Student(21,"avinash");
		System.out.println(s.age+"  "+s.name);
	}
}
