package com.calander;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringtoDate {

	
	public static void main(String[] args) {
		
		
		String strDate = "14-02-2023 2 22 33";
		 
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy hh mm ss");
		
		Date d;
		try {
			d = sd.parse(strDate);
			System.out.println(d);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
