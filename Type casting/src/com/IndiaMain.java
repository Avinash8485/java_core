package com;

public class IndiaMain {
	
	static void selectState(India obj) {
		
	    if(obj instanceof Karnataka) { 
	    	Karnataka k = (Karnataka) obj;
	        System.out.println("DownCasting to Karnataka ");
	        System.out.println("CM : "+k.cm+" PM :  "+k.pm );
	        // d.value();
	    }
	    else if(obj instanceof Tamilnadu) { // Check for Son next
	    	Tamilnadu t = (Tamilnadu) obj;
	        System.out.println("DownCasting to Tamilnadu ");
	        System.out.println("CM : "+t.cm+" PM :  "+t.pm );
	    }
	    else if(obj instanceof Goa) { // Check for Son next
	    	Goa g = (Goa) obj;
	        System.out.println("DownCasting to Goa ");
	        System.out.println("CM : "+g.cm+" PM :  "+g.pm );
	    }
	}

	public static void main(String[] args) {
		selectState(new Karnataka());
		System.out.println("===========================");
		selectState(new Tamilnadu());
		System.out.println("===========================");
		selectState(new Goa());

	}

}
