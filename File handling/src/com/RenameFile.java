package com;

import java.io.File;

public class RenameFile {

	public static void main(String[] args) {
		
		File f1 = new File("e:/Student");
		
		File f2 = new File("e:/Employee");
		
		System.out.println(f1.renameTo(f2));
		

	}

}
