package com;

import java.io.File;

public class ChecksFilePresent {

	public static void main(String[] args) {
		
		File f = new File("e:/Bar");
		
		if(f.exists()) {
			f.delete();
			System.out.println("File / Folder Deleted");
		}
		else {
			System.out.println("File / Folder not Present ");
		}

	}

}
