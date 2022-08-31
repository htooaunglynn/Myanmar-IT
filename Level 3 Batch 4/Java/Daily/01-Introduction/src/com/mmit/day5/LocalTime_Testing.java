package com.mmit.day5;

import java.time.LocalTime;

public class LocalTime_Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.of(11, 03, 45);
		LocalTime time3 = LocalTime.parse("04:30");
		
		System.out.println("Current time : " + time1);
		System.out.println("time2 : " + time2);
		System.out.println("time3 + " + time3);
		System.out.println("Previous hour : " + time1.minusHours(1).getHour());
		System.out.println("Current hour : " + time1.getHour());
		System.out.println("Current minute : " + time1.getMinute());
	}

}
