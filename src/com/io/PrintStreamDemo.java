package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) {
		
		try {
			PrintStream out = new PrintStream(new File("print.txt"));
			out.print("ok");
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
