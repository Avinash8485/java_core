package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FEST {

	public static void main(String[] args) throws IOException {
		
		
		//File f = new File("e:/car/testival.txt");

		FileWriter w = new FileWriter(new File("e:/car/testival.txt"));

		w.write("HAPPY DASARA & KINDLY DO NOT FORGET JAVA");

		w.flush();

		//w.close();

		System.out.println("Data Written");
	}

}
