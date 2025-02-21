package com;

public class Tom extends Thread {
	@Override // rule 02
	public void run() {
		
		try {
		for(int i=1 ; i<=5 ; i++) {
			System.out.println(" i:"+i);
			Thread.sleep(2000);
		}
		}
		catch(Exception e ) {
			System.out.println("ABCD");
		}
		
		}

}
