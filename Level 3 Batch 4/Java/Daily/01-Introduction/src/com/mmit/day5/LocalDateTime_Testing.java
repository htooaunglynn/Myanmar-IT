package com.mmit.day5;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTime_Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime dateTime1 = LocalDateTime.now();
		LocalDateTime dateTime2 = LocalDateTime.of(2015, Month.OCTOBER,20,04,30);
		
		System.out.println("Current date time : " + dateTime1);
		System.out.println("Date Time 2 : " + dateTime2);
		
		System.out.println("Current year : " + dateTime1.getYear());
		System.out.println("Current month : " + dateTime1.getMonth());
	}

}
