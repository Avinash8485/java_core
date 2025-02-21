package com;

public class Jerry extends Thread{
	@Override // rule 02
	public void run() {
		
		
		try {
		for(int j=6 ; j<=10 ; j++) {
			System.out.println(" J:"+j);
			Thread.sleep(2000);
		}
		}

		catch(Exception e ) {
			e.printStackTrace();
		}
	}

}
