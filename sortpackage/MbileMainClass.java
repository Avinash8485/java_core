package sortpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MbileMainClass {

	public static void main(String[] args) {
		
		
		Mobile m1 = new Mobile("vivo",10000);
		Mobile m2 = new Mobile("appo",40000);
		Mobile m3 = new Mobile("iqoo",30000);
		
		ArrayList<Mobile> a = new ArrayList<Mobile>();
		a.add(m1);
		a.add(m2);
		a.add(m3);
		
		System.out.print("Enter sorting way : ");
		Scanner input =new Scanner(System.in);
		int x = input.nextInt();
		
		switch(x) {
		case 0:
			Collections.sort(a,new MobileCostComparator());
			break;
		case 1:
			Collections.sort(a,new MobileBrandComparator());
			
		}
		
		
		
		for(Mobile m: a) {
			System.out.println(m);
		}
		

	}

}
