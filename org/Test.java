package org;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList a =new ArrayList();
		
		a.add(12);
		a.add(34);
		a.add(60);
	
		
		System.out.println(a);
		// add the element in the index 2 and the element are shifted 1 place right from index 2 till last
		a.add(2, 20);
		
		System.out.println(a);
		//override the element in the postion 1
		a.set(1, 50);
		
		System.out.println(a);
		

	}

}
