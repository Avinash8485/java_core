package mapexample;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student a,Student b) {

		return a.age-b.age;
	}

}
