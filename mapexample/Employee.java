package mapexample;

public class Employee implements Comparable<Employee>{
	int id;

	public Employee(int id) {

		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee id=" + id ;
	}

	@Override
	public int compareTo(Employee a) {
		return this.id - a.id;
	}

}
