package com;

public class arrayloopReverse {

	public static void main(String[] args) {
		//array declaration and initaliation
		int[] a = {10,20,30,40,50};

		//print using loop
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}

		System.out.println("================");

		//array declaration and inilitation
		String[] fruits = {"mango","apple","banana","strawberry"};

		//print using loop
		for(int i=fruits.length-1;i>=0;i--) {
			System.out.println(fruits[i]);
		}
	}

}
