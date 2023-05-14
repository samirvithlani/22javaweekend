package com.debug;

import java.util.Scanner;

public class DebugDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no1 ");
		int no1 = sc.nextInt();
		System.out.println(no1);
		no1 = no1 +1;
		System.out.println(no1);
		no1++;
		System.out.println(no1);
		sc=null;
		
	}
}
