package customexception;

import java.util.Scanner;

public class Election {

	static void checkEligility(int age) throws AgeInvalidException{
		if(age>18) {
			System.out.println("ELIGIBLE TO VOTE");
		}
		else {
			throw new AgeInvalidException("Not eligible to vote");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a age : ");
		int age = input.nextInt();
		
			try {
				checkEligility(age);
			}
			catch(AgeInvalidException e) {
				System.out.println(e.getMessage());
			}
		
		
		
		finally {
			input.close();
		}

	}

}
