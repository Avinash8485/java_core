package com;

public class Car extends Vechicle{
	
	@Override
	void start() {
		
		super.start(); // to get access for the super class or parent class
		
		System.out.println("Car Started");
	}

}
