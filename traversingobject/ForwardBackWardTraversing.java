package traversingobject;

import java.util.ArrayList;
import java.util.ListIterator;

public class ForwardBackWardTraversing {
public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		ListIterator<Integer> b = a.listIterator();
		
		
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		
		
		System.out.println("=========================");
		
		while(b.hasPrevious()) {
			System.out.println(b.previous());
		}

	}
}
