package com.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionDemo2 {

	public int div(int no1, int no2) throws IOException {

		int x = no1 / no2;

		return x;
	}

	public static void main(String[] args) {

//		File f = new File("abc");
//		f.createNewFile();

		ExceptionDemo2 e2 = new ExceptionDemo2();
		try {
			// e2.div(1, 2);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
	}
}
