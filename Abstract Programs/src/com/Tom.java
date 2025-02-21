package com;

public class Tom extends Person {

	void method() {
		System.out.println("Tttttom is eating");
		
	}
	public static void main(String[] args) {
		Tom t = new Tom();
		t.eat();
		t.method();
	}
}
