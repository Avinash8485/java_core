package org;

public class Employee {

	int id;
	String name;
	double salary;

	Employee(int id) {
		this.id = id;
	}
	Employee(int id,String name) {
		this(id);
		this.name=name;
	}
	Employee(int id,String name,double salary) {
		this(id,name);
		this.salary=salary;
	}

	public static void main(String[] args) {
		Employee e = new Employee(1734,"Tom",25672);
		System.out.println("id : "+e.id);
		System.out.println("Name : "+e.name);
		System.out.println("Salary : "+e.salary);
		


	}

}
