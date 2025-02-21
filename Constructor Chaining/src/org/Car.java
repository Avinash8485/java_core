package org;

public class Car {
	
	int cost;
	String brand;
	
	Car(String brand){
		this.brand=brand;
	}
	
	Car(String brand,int cost){
		this(brand);
		this.cost=cost;
	}	

	public static void main(String[] args) {
		Car c = new Car("yamaha",250000);
		System.out.println(c.brand+"  "+c.cost);

	}

}
