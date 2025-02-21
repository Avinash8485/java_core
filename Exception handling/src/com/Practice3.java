package com;

public class Practice3 {
	public static void main(String[] args) {
		int[] arr= {10,20};
		try {
			
			try {
				System.out.println(10/0);
			} catch (Exception e) {
				System.out.println("Arithmetic Exception handled");
			}System.out.println(arr[100]);
			
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
