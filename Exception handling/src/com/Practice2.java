package com;

public class Practice2 {

	public static void main(String[] args) {

		try {


			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array IndexOutOfBounds Exception handled");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception handled");
		}
		catch(Exception e) {
			System.out.println("Super class handled");
		}



	}

}
