package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleReaderDemo {

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("C:\\Users\\Samir\\Desktop\\dictonry");
			// int x = reader.read();
			// System.out.println((char)x);
			int c =0;
			int count =0;
			
			while((c= reader.read())!= -1) {
				System.out.print((char)c);
				count++;
			}
			
			System.out.println("count = "+count);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
