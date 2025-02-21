package set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();  //Insertion Order is not Maintained
		h.add(100);
		h.add(1.234);
		h.add("java");
		h.add(null);
		
		System.out.println("Size : "+h.size());
		
		for(Object i : h) {
			System.out.println(i);
		}
	
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();   //Insertion Order is  Maintained
		lh.add(1);
		lh.add(4);
		lh.add(3);
		
		System.out.println("Size : "+lh.size());
		
		for(int i : lh) {
			System.out.println(i);
		}
	}
	

}
