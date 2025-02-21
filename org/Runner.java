package org;
import java.util.*;
public class Runner {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		System.out.println(a);
		System.out.println("------------------");
		Collections.sort(a);
		System.out.println(a);
		System.out.println("------------------");
		Collections.reverse(a);
		System.out.println(a);
		System.out.println("------------------");
		
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(1.34);
		l.add("java");
		System.out.println(l);
		System.out.println("------------------");
		Collections.reverse(l);
		System.out.println(l);
	}

}
