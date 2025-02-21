package org;

import com.Car;

//Accessing public members in different package

class CarMainClass {

	public static void main(String[] args) {
		
		System.out.println(Car.brand);
		
		Car c = new Car();
		System.out.println(c.cost);
		

	}

}