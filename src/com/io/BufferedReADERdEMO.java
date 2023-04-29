package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReADERdEMO {

	public static void main(String[] args) {
		
		
//		br.read();
		String data ="";
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Samir\\Desktop\\dictonry"));
			while((data = br.readLine())!= null){
				System.out.println(data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
