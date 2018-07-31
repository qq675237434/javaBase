package com.yi.io;

import java.io.File;
import java.io.IOException;

public class JavaFile {
	public static void main(String[] args) throws IOException {
		File file = new File("D://temp");
		System.out.println(file.exists());
		
		file.createNewFile();
		
		System.out.println(file.exists());
		
		file.delete() ;
		
		System.out.println(file.exists());
		
		
	}
}
