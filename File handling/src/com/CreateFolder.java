package com;

import java.io.File;
import java.io.IOException;

public class CreateFolder {


	public static void main(String[] args) throws IOException {
		

		// .txt ,.doc ,.docx ,.eles ,.pdf
		File f =new File("E:/car/bar.doc");

		boolean result =f.createNewFile();//after creating a older ,it returns true or false
		System.out.println(result); //System.out.println(f.mkdir());
	}

}

