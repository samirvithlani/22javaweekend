package com.date;

import java.util.Date;

//user age ---> 18
//day
public class DateDemo2 {

	public static void main(String[] args) {

		Date date = new Date();
		date.setDate(14);
		date.setHours(1);
		date.setYear(75);
		date.setMonth(1);
		date.setMinutes(20);

		System.out.println(date);

		Date date2 = new Date(112, 11, 11);
		System.out.println(date2);

		System.out.println(date2.after(date));
		System.out.println(date.compareTo(date2));

	}
}
