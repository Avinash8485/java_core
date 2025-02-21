package defaultsorting;

import java.util.TreeSet;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student(20);
		Student s2 = new Student(22);
		Student s3 = new Student(23);
		
//TreeSet calls compare to method of student class
		TreeSet<Student> t = new TreeSet<Student>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Student s: t) {
			System.out.println(s);
		}
	}

}
