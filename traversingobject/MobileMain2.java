package traversingobject;

import java.util.ArrayList;
import java.util.ListIterator;

public class MobileMain2 {

	public static void main(String[] args) {
		
		Mobile2 m1 = new Mobile2(20000,"s7","Samsaung");
		Mobile2 m2 = new Mobile2(30000,"s8","IQOO");
		Mobile2 m3 = new Mobile2(40000,"s9","vivo");
		
		ArrayList<Mobile2> a = new ArrayList<Mobile2>();
		
		a.add(m1);
		a.add(m2);
		a.add(m3);
		
		ListIterator<Mobile2> b = a.listIterator();
		
		while(b.hasNext()) {
			Mobile2 s =b.next();
			System.out.println("Brand : "+s.brand+" ModelNo : "+s.model+" Cost : "+s.cost);
		}
		
		System.out.println("=========================================================================");
		
		while(b.hasPrevious()) {
			Mobile2 s =b.previous();
			System.out.println("Brand : "+s.brand+" ModelNo : "+s.model+" Cost : "+s.cost);
		}

	}

}
