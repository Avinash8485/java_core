package rtp;

class Employee {
	void work() {
		System.out.println("working");
	}
}


class Developer extends Employee{
	@Override
	void work() {
		System.out.println("developing");
	}
}


class Tester extends Employee{
	@Override
	void work() {
		System.out.println("Testing");
	}
}
