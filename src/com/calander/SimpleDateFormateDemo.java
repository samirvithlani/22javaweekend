package com.calander;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateDemo {

	public static void main(String[] args) {
		
		
		//Date string,....
		Date date = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss a zzzz u");
		
		String strDate = formatter.format(date);
		System.out.println(strDate);
		
		
		
		
		
		
	}
	
}
