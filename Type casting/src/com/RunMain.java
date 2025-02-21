package com;

public class RunMain {
	/**
	 * Generalization or upcastiong
	 * 1. if display(new Son());  --->  Father obj = new Son();
	 * 2. if display(new Daughter());  --->  Father obj = new Daughter();
	 * 
	 * */	
	static void display(Father obj) {
		
		    if(obj instanceof Daughter) { // Check for Daughter first
		        Daughter d = (Daughter) obj;
		        System.out.println("DownCasting to Daughter ");
		        System.out.println(d.z+" "+d.x);
		        // d.value();
		    }
		    else if(obj instanceof Son) { // Check for Son next
		        Son s = (Son) obj;
		        System.out.println("DownCasting to son ");
		        System.out.println(s.x + " " + s.y);
		    }
		}
	public static void main(String[] args) {
		display(new Son());
		System.out.println("==================");
		display(new Daughter());
	}

}
