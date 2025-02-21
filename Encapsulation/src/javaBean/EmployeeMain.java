package javaBean;
import java.util.*;
public class EmployeeMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Employee e = new Employee();

		System.out.print("enter the employee id :");
		e.setId(input.nextInt());

		System.out.print("enter the employee name :");
		e.setName(input.next());

		System.out.print("enter the employee salary :");
		e.setSalary(input.nextDouble());

		System.out.println("the employee id :"+e.getId());

		System.out.println("the employee id :"+e.getName());

		System.out.println("the employee id :"+e.getSalary());




	}

}
