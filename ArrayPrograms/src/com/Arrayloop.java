package com;

public class Arrayloop {

	public static void main(String[] args) {
		
		//array declaration and inilitation
		int[] a = {10,20,30,40,50};
		
		//print using loop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("================");
		
		//array declaration and inilitation
				String[] fruits = {"mango","apple","banana","strawberry"};
				
				//print using loop
				for(int i=0;i<fruits.length;i++) {
					System.out.println(fruits[i]);
				}
		
		
		

	}

}

//   i<3 --- hard coding
//   i<a.length (good practice)
