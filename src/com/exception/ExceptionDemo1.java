package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter no1 ");
			int no1 = sc.nextInt();
			System.out.println("enter no2 ");
			int no2 = sc.nextInt();
			int res = no1 / no2;
			System.out.println(res);
			
		}
//		catch (Exception e) {
//
//			System.out.println("internal server error...");
//		} error...
		catch (ArithmeticException e) {
			
			//e.printStackTrace();
			System.out.println("can not divide by zero");
		}
		catch (InputMismatchException e) {
			
			System.out.println("please check your input");
		}
		catch (Exception e) {

			System.out.println("internal server error...");
		}
		finally {
			sc.close();
			System.out.println("it will execute....");
		}
		
		
		
		
		
	}
}
