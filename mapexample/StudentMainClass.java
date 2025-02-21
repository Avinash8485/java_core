package mapexample;


import java.util.Set;
import java.util.TreeMap;

public class StudentMainClass {

	public static void main(String[] args) {
		Student s1 = new Student("Avinash",22);
		Student s2 = new Student("Gowtam",23);
		Student s3 = new Student("Yaswanth",21);
		
		TreeMap<Student,Integer> t = new TreeMap<Student,Integer>(new StudentNameComparator());
		t.put(s1, 70);
		t.put(s2, 99);
		t.put(s3, 80);
		
		Set<Student> keys = t.keySet();
		
		for(Student s : keys) {
			System.out.println(s+" Marks : "+t.get(s));
		}

	}

}
