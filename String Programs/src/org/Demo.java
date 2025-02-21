package org;

public class Demo {

	public static void main(String[] args) {
		String s1 = new String("Hello "); 
		System.out.println(s1);
		s1.concat(" world"); //immutable (not modifiable) so new object get created and reinitalized but reference is still pointing old object 
		System.out.println(s1);
		
		System.out.println("------------------");
		
		String s2 = new String("Hello ");
		System.out.println(s2);
		s2 = s2.concat(" world");//immutable (not modifiable) so  new object get created and reinitalized but reference is pointing to new object
		System.out.println(s2);
		
		System.out.println("------------------");
		
		StringBuffer s3 = new StringBuffer("Hello ");
		System.out.println(s3);
		s3.append(" world"); // StringBuffer is mutable(modifiable) so its reinitaliziting
		System.out.println(s3);
		
		System.out.println("------------------");
		
		StringBuilder s4 = new StringBuilder("Hello ");
		System.out.println(s4);
		s4.append(" world"); // StringBuilder is mutable(modifiable) so its reinitaliziting
		System.out.println(s4);

	}

}
