package com.io;

import java.io.File;
import java.io.IOException;
import java.rmi.dgc.DGC;
import java.util.Scanner;

public class FileMatser {

	public boolean createUDFFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter file name to create without ext..");
		String fname = sc.next();
		File file = new File(fname.concat(".txt"));

		try {
			if (!file.exists()) {
				return file.createNewFile();
			} else {
				return false;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

	public static void main(String[] args) {

		int choice = 0;
		Scanner sc = new Scanner(System.in);
		FileMatser master = new FileMatser();

		do {
			System.out.println("ENTER your choice");
			System.out.println("press 1 for create file :");
			System.out.println("press 2 for create folder :");
			System.out.println("press 3 for create folders :");
			System.out.println("press 4 for Delete file.");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				//
				if (master.createUDFFile()) {
					System.out.println("file created....");
				} else {
					System.out.println("file not created... file already exist...");
				}
				break;
			case 2:
				System.out.println("enter folder name to create..");
				String folderName = sc.next();
				// File file = new File(folderName);
				File file = new File("src//util//" + folderName);
				if (file.exists()) {
					System.out.println("folder already exist...");
				} else {

					if (file.mkdir()) {
						System.out.println("folder created..." + folderName);
					} else {
						System.out.println("folder not created...");
					}

				}
				break;

			case 3:
				File file2 = new File("x\\y\\z");
				file2.mkdirs();
				break;

			case 4:
				System.out.println("enter file name to delete...");
				String dfname = sc.next();
				File file3 = new File(dfname);
				if (file3.exists()) {
						
					if (file3.delete()) {
						System.out.println("file deleted.." + dfname);
					} else {
						System.out.println("file not deleted..." + dfname);
					}
				}

				break;
			case 5:
					
			break;
			}

		} while (choice != 5);

	}
}
