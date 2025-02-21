package javaBean;
import java.util.*;
public class MobileMainClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Mobile m = new Mobile();
		
		System.out.print("Enter the brand : ");
		m.setbrand(input.nextLine());
		
		System.out.print("Enter the cost : ");
		m.setcost(input.nextInt());
		
		input.close();//to close the scanner class
		
		System.out.println(m.getbrand());
		System.out.println(m.getcost());

	}

}
