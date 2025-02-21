package com;

public class VechicleMain {
	static void display(Vechicle obj) {
		if(obj instanceof Car) {
			Car c = (Car) obj;
			System.out.println("DownCasting to Car ");
			System.out.println("Brand : "+c.brand);
			c.drive();
		}
		else if(obj instanceof Bike) {
			Bike b = (Bike) obj;
			System.out.println("DownCasting to Bike ");
			System.out.println("Brand : "+b.brand);
			b.ride();
			
		}
	}
	

	public static void main(String[] args) {
		display(new Car());
		System.out.println("==================");
		display(new Bike());
	}
}
