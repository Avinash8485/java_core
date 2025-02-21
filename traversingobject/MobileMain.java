package traversingobject;

import java.util.ArrayList;
import java.util.Iterator;

public class MobileMain {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Vivo","shusj",6733);
		Mobile m2 = new Mobile("Iqoo","jdusj",8733);
		
		ArrayList<Mobile> a = new ArrayList<Mobile>();
		a.add(m1);
		a.add(m2);
		
		Iterator<Mobile> i = a.iterator();
		while(i.hasNext()) {
			Mobile m = i.next();
			System.out.println("Brand : " +m.brand+" Model : "+m.model+" Cost : "+ m.cost);
		}

	}

}
