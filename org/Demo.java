package org;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add(27);
		l.add(23.45);
		l.add("Java");
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("================");
		
		for (int i = l.size()-1; i >=0; i--) {
			System.out.println(l.get(i));;
			
		}
	}

}
