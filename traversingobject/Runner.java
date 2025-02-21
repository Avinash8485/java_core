package traversingobject;

import java.util.ArrayList;
import java.util.Iterator;

public class Runner {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Avinash");
		a.add("yaswanth");
		a.add("Akanash");
		a.add("Gowtham");
		a.add("Akash");
		a.add("Hari");
		
		Iterator<String> i = a.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
