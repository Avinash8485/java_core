package traversingobject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorTraversingAll {

	public static void main(String[] args) {
		
		
		//Only Forward Traversing
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Tom");
		ar.add("Jack");
		ar.add("Jim");
		
		Iterator<String> br = ar.iterator();
		
		
		while(br.hasNext()) {
			System.out.println(br.next());
		}
		
		System.out.println("=========================");
		
		//Both forward and BackWard Traversing
		LinkedList<Double> x = new LinkedList<Double>();
		x.add(10.4);
		x.add(20.5);
		x.add(30.7);
		
		ListIterator<Double> y = x.listIterator();
		
		
		while(y.hasNext()) {
			System.out.println(y.next());
		}
		
		
		System.out.println("=========================");
		
		while(y.hasPrevious()) {
			System.out.println(y.previous());
		}

		
		//Only BackWard Traversing
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		
		ListIterator<Integer> b = a.listIterator(a.size());
		
		System.out.println("=========================");
		
		while(b.hasPrevious()) {
			System.out.println(b.previous());
		}
	}

}
