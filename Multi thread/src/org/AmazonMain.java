package org;

public class AmazonMain {

	public static void main(String[] args) {
		
		//Runnable Type Object
		Amazon a = new Amazon();
		//Converting Runnable type to Thread Type
		Thread t = new Thread(a);
		//Setting Thread Name
		t.setName("Amazon");
		//invoke Start()
		t.start();
		
		Thread t1 = new Thread(new Amazon());
		t1.setName("Amazon");
		t1.start();
	
		
		Thread t2 = new Thread(new Amazon(),"Amazon");
		t2.start();
		
		 new Thread(new Amazon(),"Amazon").start();  //Ananomous object

	}

}
