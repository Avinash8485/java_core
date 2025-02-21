package mapexample;

import java.util.LinkedHashMap;
import java.util.Set;

public class CarMain {

	public static void main(String[] args) {
		Car c1 = new Car("Audi");
		Car c2 = new Car("Rolls Roys");
		Car c3 = new Car("Bezs");
		
		LinkedHashMap<Car,Integer> l = new LinkedHashMap<Car, Integer>();
		
		l.put(c1, 1000000);
		l.put(c2, 2000000);
		l.put(c3, 3000000);
		
		
		Set<Car> keys = l.keySet();
		for(Car c : keys) {
			System.out.println(c+" Cost : "+l.get(c));
		}
		

	}

}
