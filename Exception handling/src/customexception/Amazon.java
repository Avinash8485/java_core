package customexception;

import java.util.Scanner;

public class Amazon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a mark");
		int marks = input.nextInt();
		if(marks>=70 && marks<=100) {
			System.out.println("Apply for interwiew");
		}
		else
			try {
				throw new InvalidMarksException("Not eligible to apply");
			}
		catch(InvalidMarksException e) {
			System.out.println(e.getMessage());
		}
	}

}
