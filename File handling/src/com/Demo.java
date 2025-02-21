package com;

import java.io.File;

public class Demo {

	public static void main(String[] args) {
		//Object representation of a file name or folder name
		//Since path is not specified , folder gets created inside the project 
		//File f = new File("Car");
		
		// Folder gets created within e drive
		File f =new File("E:/Student");
		
		boolean result =f.mkdir();//after creating a older ,it returns true or false
		System.out.println(result); //System.out.println(f.mkdir());
	}

}


//directory -> folder -> package