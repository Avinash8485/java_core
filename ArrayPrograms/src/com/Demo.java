package com;

public class Demo {

	public static void main(String[] args) {

		//Array declaration
		int[] a;

		//array creation
		a= new int[4];

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);

		//array initalization
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;

		System.out.println("------------");

		//print the array
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println("length :  "+a.length);
		
		System.out.println("==============");


		//Array declaration & creation

		double[] b = new double[2];
		
		//print the array
		System.out.println(b[0]);
		System.out.println(b[1]);

		//array initalization
		b[0] = 1.45;
		b[1] = 2.56;

		System.out.println("------------");

		//print the array
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		System.out.println("length : "+b.length);




	}

}
