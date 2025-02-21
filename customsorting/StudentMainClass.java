package customsorting;

import java.util.TreeSet;

public class StudentMainClass {

	public static void main(String[] args) {
		Student s3 = new Student(22,"Avi");
		Student s2 = new Student(23,"Gowtham");
		Student s1 = new Student(21,"Yeswanth");
		
		
		//TreeSet<Student> t = new TreeSet<Student>(new StudentNameComparator()); sort by using string
		TreeSet<Student> t = new TreeSet<Student>(new StudentAgeComparator());
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Student s : t) {
			System.out.println(s);
		}
	}

}
