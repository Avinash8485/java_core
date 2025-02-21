package traversingobject;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(30);
		a.add(20);
		a.add(40);
		a.add(50);
		a.add(60);
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("------------------");
		
		for(Integer i : a) {
			System.out.println(i);
		}
		
		System.out.println("===================");
		
		Iterator<Integer> i= a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
