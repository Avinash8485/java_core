package com;

public class CalculatorImp implements Calculator { // Rule 2

	@Override			//Rule 3
	public void add(int a,int b) {
		int sum = a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+sum);
	}
	@Override			//Rule 3
	public void multiply(int a,int b) {
		int multi = a*b;
		System.out.println("Product of "+a+" and "+b+" is "+multi);
	}
}
