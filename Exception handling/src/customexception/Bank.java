package customexception;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		int balance = 5000;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a amount to withdraw");
		int withdraw = input.nextInt();
		if(withdraw<=balance)
			System.out.println("Amount withdraw Sucessfully");
		else
			try {
			throw new InsufficientBalanceException("Insufficitent balance");
			}
		catch(InsufficientBalanceException e) {//Exception e(generalization)
			System.out.println(e.getMessage());
		}

	}

}
