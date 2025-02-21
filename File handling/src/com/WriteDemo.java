package com;

import java.io.File;
import java.io.FileWriter;

public class WriteDemo {

	public static void main(String[] args) throws Exception{
		
		File f = new File("e:/car/Bar.txt");
		
		FileWriter w = new FileWriter(f);
		
		w.write("Avinash");
		
		w.flush();
		
		w.close();
		
		System.out.println("Data Written");
		

	}

}
