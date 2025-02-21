package traversingobject;

import java.util.ArrayList;
import java.util.Iterator;

public class CarMain {

	public static void main(String[] args) {

		Car c1 = new Car("rolls roys",100000);
		Car c2 = new Car("Volvo",200000);
		Car c3 = new Car("Audi",300000);
		
		ArrayList<Car> a = new ArrayList<Car>();
		a.add(c1);
		a.add(c2);
		a.add(c3);
		
		Iterator<Car> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
