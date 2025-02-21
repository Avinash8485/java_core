package com;

import java.io.File;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) throws Exception{
		
		File f = new File("e:/car/festival.txt");
		
		FileReader w = new FileReader(f);
		
		int y = w.read();
		
		while(y != -1) {
			
			System.out.print((char)y);
			y = w.read();
			
		}
		System.out.println();
		w.close();
		
		System.out.println("Readed succesfully");
		

	}

}
