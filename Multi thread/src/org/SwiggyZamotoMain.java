package org;

public class SwiggyZamotoMain {

	public static void main(String[] args) {
		
		Thread t = new Thread (new Zomato(),"Zamoto");
		t.start();
		
		Swiggy t1 = new Swiggy();
		t1.start();

	}

}
