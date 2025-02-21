package com;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the array size : ");
		int n=sc.nextInt();

		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the array of "+i);
			a[i]=sc.nextInt();
		}
		sc.close();//to close the scanner class


		//print using loop
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}

	}

}
