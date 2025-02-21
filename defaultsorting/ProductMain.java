package defaultsorting;

import java.util.TreeSet;

public class ProductMain {

	public static void main(String[] args) {
		
		Product p = new Product(101,"Apple");
		
		Product p1 = new Product(102,"orange");
		
		Product p2 = new Product(103,"grapes");
		
		Product p3 = new Product(104,"banana");
		
		
		TreeSet<Product> s = new TreeSet<Product>();
		
		s.add(p2);
		s.add(p3);
		s.add(p);
		s.add(p1);
		
		for(Product a : s) {
			System.out.println(a);
		}
			
		

	}

}
