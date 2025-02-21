package mapexample;

import java.util.Set;
import java.util.TreeMap;


public class EmployeeMainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee(104);
		Employee e2 = new Employee(101);
		Employee e3 = new Employee(102);
		
		TreeMap<Employee,String> t = new TreeMap<Employee,String>();
		
		t.put(e1, "Tom");
		t.put(e2, "Jerry");
		t.put(e3, "Jack");
		
		Set<Employee> keys = t.keySet();
		
		for(Employee e : keys) {
			System.out.println(e+" Name : "+t.get(e));
		}
		

	}

}
