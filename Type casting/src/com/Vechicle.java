package com;

public class Vechicle {
	String brand = "Mahindra";

}
class Car extends Vechicle{
	void drive() {
		System.out.println("Driving car");
	}
}
class Bike extends Vechicle{
	void ride() {
		System.out.println("Riding car");
	}
}

