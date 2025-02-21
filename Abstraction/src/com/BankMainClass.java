package com;
import java.util.*;
public class BankMainClass {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		Bank b = new BankImpl();	//upcasting
		
		b.checkBalance();
		
		System.out.println("--------------------");
		System.out.println("Amount need to deposit");
		b.depsoit(input.nextInt());
		b.checkBalance();
		
		System.out.println("--------------------");
		System.out.println("Amount need to widthdraw");
		b.withdraw(input.nextInt());
		b.checkBalance();
		System.out.println("--------------------");
		

	}

}
