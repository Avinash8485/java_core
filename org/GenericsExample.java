package org;
import java.util.*;
public class GenericsExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(25);
		
		for(int i: a) {// Integer also works  for(Integer i: a) {
			System.out.println(i);
		}
		
		System.out.println("=================");
		
		
		LinkedList<Double> b = new LinkedList<Double>();
		
		b.add(23.4);
		b.add(34.5);
		b.add(45.6);
		b.add(56.7);
		b.add(67.8);
		
		for(double i: b) { // Double also works   for(Double i: b)
			System.out.println(i);
		}
		

	}

}
