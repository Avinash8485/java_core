package com;

public class Customer extends Amazon{
void pay(int amount) {
	System.out.println("Paying "+amount);
}
void buy(String product) {
	System.out.println("buying "+product);
}
public static void main(String[] args) {
	Customer c = new Customer();
	c.buy("Laptop");
	c.pay(35262);
}
}
