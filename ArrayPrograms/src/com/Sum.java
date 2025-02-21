package com;
import java.util.*;
public class Sum {

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
		int sum =0;

		//print using loop
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		int avg = sum/a.length;
		System.out.println("sum value : "+sum);
		System.out.println("average value : "+avg);

	}

}
