package com;
import java.util.*;
public class CaluclatorMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Calculator calci = new CalculatorImp();		//Rule 4
		
		calci.add(input.nextInt(),input.nextInt());
		calci.multiply(input.nextInt(), input.nextInt());
		
		input.close();

	}

}
