package com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {

		try {
			File file = new File("royal1.txt");
			// FileWriter writer = new FileWriter("royal.txt",true);
			FileWriter writer = new FileWriter(file, true);
			writer.write("Hello");
			writer.close();
			System.out.println("done....");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
