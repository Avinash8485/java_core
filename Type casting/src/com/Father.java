package com;

public class Father {// x
	int x = 20;
}

class Son extends Father{// x	&	y
	int y =15;
	
}

class Daughter extends Son{// x	&	z
	int x = 22;
	int z = super.x;
	
	/*void value() {
		System.out.println(super.x);
	}*/
	
}
