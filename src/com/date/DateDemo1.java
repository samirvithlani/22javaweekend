package com.date;

import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getMonth());
		System.out.println(date.getSeconds());
		System.out.println(date.getTime());
		System.out.println(date.getYear());
		System.out.println(date.getTimezoneOffset());;
		
//		Date date2 = new Date(168336667000l);
//		System.out.println(date2);
	}
}
