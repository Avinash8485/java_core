package org;

class Tom extends Employee {

	@Override
	void eat() {
		System.out.println("eating");	
	}

	@Override
	void walk() {
		System.out.println("walking");	
	}

	@Override
	void work() {
		System.out.println("working");	
	}

	public static void main(String[] args) {
		Tom t = new Tom();
		t.eat();
		t.work();
		t.walk();

	}

}
