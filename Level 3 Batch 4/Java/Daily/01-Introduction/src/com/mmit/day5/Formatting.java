package com.mmit.day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//predefined patterns
		DateTimeFormatter dateFormat = DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter timeFormat = DateTimeFormatter.ISO_LOCAL_TIME;
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("Default date : " + date);
		
		System.out.println("ISO format : " + date.format(dateFormat));
		System.out.println("ISO format : " + time.format(timeFormat));
		System.out.println("ISO format : " + dateTime.format(dateTimeFormat));
		
		// customa format
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM dd yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("h-mm-ss a");
		
		System.out.println("Default : " + time);
		System.out.println("");
		
		
	}

}
