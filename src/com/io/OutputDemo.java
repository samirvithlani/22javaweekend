package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class OutputDemo {

	public static void main(String[] args) {
		
		String str = "hello this is byte data";
		try {
			FileOutputStream out = new FileOutputStream(new File("input.txt"));
			byte b[] = str.getBytes();
			out.write(b);
			out.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
