package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) {

		//relative path...
		boolean flag=false;
		File file = new File("src\\com\\abc1.txt");
		try {
			flag = file.createNewFile();
			if(flag) {
				System.out.println("file created..");
			}
			else {
				System.out.println("file not created....");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
