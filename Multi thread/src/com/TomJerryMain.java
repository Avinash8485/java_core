package com;

public class TomJerryMain {
	public static void main(String[] args) {
		
		Tom t = new Tom();
		t.setName("Tom");
		t.setPriority(8);
		t.start();
		
		
		Jerry j = new Jerry();
		j.setName("Jerry");
		j.start();
		j.setPriority(9);
	}

}

/*
multi threading happens so it runs parallely
t.start();
j.start();

it will run in existing thread so it will complete t and start run t as per sequential order
t.run()
j.run()

*/

