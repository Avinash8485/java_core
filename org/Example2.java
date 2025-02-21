package org;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();

		a.add("Gowtham");
		a.add("Akash");
		a.add("Avinash");
		a.add("Akanash");
		a.add("Hari");

		System.out.println(a);
		System.out.println("----------------");

		System.out.println("0 -> for Assending and 1 -> for descending");
		System.out.print("Enter your choice : ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		switch(choice) {
		case 0:
			Collections.sort(a);
			for(int i=0;i<a.size();i++) {
				System.out.println(a.get(i));
			}
			break;
		case 1:
			Collections.sort(a);
			Collections.reverse(a);
			for(int i=0;i<a.size();i++) {
				System.out.println(a.get(i));
			}
			break;
		default:
			System.out.println("Invalid");
		}

		input.close();

	}

}
