package customsorting;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		// Creating an ArrayList of Employee objects
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(102, "Alice", 50000));
		employees.add(new Employee(101, "Bob", 60000));
		employees.add(new Employee(103, "Charlie", 45000));

		// Sorting using the custom Comparator
		Collections.sort(employees, new EmployeeIdComparator());

		// Printing the sorted list
		System.out.println("Employees sorted by ID:");
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
}
