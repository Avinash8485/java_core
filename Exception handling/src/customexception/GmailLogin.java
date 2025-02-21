package customexception;

import java.util.Scanner;

public class GmailLogin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int password = input.nextInt();
		input.close();
		
		if(password==123) {
			System.out.println("SucessFull login");
		}
		else
			throw new InvalidPasswordException("Invalid password");  //custom exception creation
		/*	exception handling
		 * else
			try {
				throw new InvalidPasswordException("Invalid Password");
			}
		catch (Exception e ) {
			System.out.println(e.getMessage());
		}
		*/

	}

}
