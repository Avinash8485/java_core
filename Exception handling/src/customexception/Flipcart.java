package customexception;

import java.util.Scanner;

public class Flipcart {
	static void login(int otp) throws InvalidOTPException{
		if(otp == 123) {
			System.out.println("OTP successfull");
		}
		else 
			throw new InvalidOTPException("OTP mismatch");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter otp : "); 		int otp = input.nextInt();
		try {
			login(otp);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			input.close();
		}
	}
}
