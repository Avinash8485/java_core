package org;
import java.util.*;
public class ReverseAString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String value = input.nextLine();
		char[] arr = value.toCharArray();
		char temp;
		for(int j=0,i=arr.length-1;j>i;i--,j++) {
			temp = arr[j];
			arr[j]=arr[i];
			arr[i]= temp;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}


	}

}
