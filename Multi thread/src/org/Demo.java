package org;

public class Demo {

	public static void main(String[] args) {
		
		//Default thread name is provided
		Thread t1 = new Thread();
		System.out.println("Name : "+t1.getName());
		
		// By using setName() provinding custom name to the default thread
		t1.setName("Bile Thread");			
		System.out.println("Name : "+t1.getName());
		
		System.out.println("=====================================");
		
		//Custom thread name is provided
		Thread t2 = new Thread("Car Thread");
		System.out.println("Name : "+t2.getName());
		

	}

}
