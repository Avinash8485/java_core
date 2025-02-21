package vectorExample;
import java.util.*;
public class MethodExample {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		
		LinkedList l1 = new LinkedList();
		l1.addAll(a1);
		l1.add(45);
		
		System.out.println(l1);
		System.out.println("--------------------");
		
		System.out.println(l1.containsAll(a1));
		System.out.println("--------------------");
		
		System.out.println(l1);
		l1.removeAll(a1);
		System.out.println(l1);
		
		
		
		
	}

}
