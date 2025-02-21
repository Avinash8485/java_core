package vectorExample;

import java.util.ArrayList;
import java.util.LinkedList;

public class MethodExample1 {
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);
		
		LinkedList y = new LinkedList();
		y.add(x); // l1.addAll(a1)
		y.add(45);
		
		System.out.println("Element : "+y+" 	Size : "+y.size());
		
		
		/*
		 * x  -> ArrayList   		y  ->  LinkedList
		 * 
		 * 1.	 If we use y.addAll(x); -> We are adding all the objects of 1 Collection into another Collection 1 by 1 (sequentially).
		 * 		 Therefore Elements -> [10, 20, 30] and Size -> 3
		 * 
		 *  2. 	 If we use y.add(x); -> We are adding all the objects of 1 Collection into another Collection as a single object.
		 *  	 Therefore Elements -> [[10, 20], 30] and Size -> 2
		 *  	 
		 */
		
		
		
		
	}
}
