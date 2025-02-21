package customsorting;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student>{
	@Override
	public int compare(Student x,Student y) {
		return x.name.compareTo(y.name); //y.name.compareTo(x.name) for Descending
	}
}

// to compare String objects ,we should use compateTo() of String class
