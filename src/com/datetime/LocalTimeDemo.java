package com.datetime;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		System.out.println(time.getHour()+" " +time.getMinute()+ " "+time.getSecond() + " "+time.getNano());
		
		LocalTime time2 = time.plusHours(1);
		System.out.println(time2);
		System.out.println(time.isAfter(time2));
		
		
	}
}
