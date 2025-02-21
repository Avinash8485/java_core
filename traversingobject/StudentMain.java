package traversingobject;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentMain {

	public static void main(String[] args) {
		Student s1= new Student(22,"Avi");
		Student s2= new Student(23,"Gowtham");
		
		
		ArrayList<Student> a = new ArrayList<Student>();
		a.add(s1);
		a.add(s2);
		
		Iterator<Student> i = a.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println("Age "+s.age +" Name "+s.name);
		}
	}

}
