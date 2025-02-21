package generalization;

import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) {
		
		ArrayList<Person> l = new ArrayList<Person>();
		
		
		l.add(new Student());
		l.add(new Employee());
		
		
		for(Person obj : l) {
			if(obj instanceof Student) {
				Student a = (Student) obj;
				System.out.println(a.marks);
			}
			else if(obj instanceof Employee) {
				Employee b = (Employee) obj;
				System.out.println(b.Salary);
			}
		}

	}

}
