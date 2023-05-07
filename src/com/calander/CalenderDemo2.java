package com.calander;

import java.util.Calendar;

public class CalenderDemo2 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 15);
		c.add(Calendar.MINUTE, 0);
		c.add(Calendar.YEAR, 0);
		
		System.out.println(c.getTime());
	}
}
