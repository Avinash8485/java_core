package traversingobject;

import java.util.ArrayList;
import java.util.ListIterator;

public class OnlyBackwardTraversing {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		
		
		//If u use ListIterator method the cursor will always  pointing towards the starting point 
		//we need to change the cursor to point the end so a.size() method will return the size and the cursor start pointing at the last
		ListIterator<Integer> b = a.listIterator(a.size());
		
		
		
		
		System.out.println("=========================");
		
		while(b.hasPrevious()) {
			System.out.println(b.previous());
		}

	}

}
