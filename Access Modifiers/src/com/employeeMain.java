package com;

public class employeeMain {
	
	//Accessing public class in different class but in same package

	public static void main(String[] args) {
		
		System.out.println("ID : "+Employee.id);
		
		Employee emp = new Employee();
		
		emp.work();
		
		System.out.println("ID : "+emp.id);
		
		
		

	}

}
