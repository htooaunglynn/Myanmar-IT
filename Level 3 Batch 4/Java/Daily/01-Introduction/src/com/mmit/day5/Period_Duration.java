package com.mmit.day5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;


public class Period_Duration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate startDate = LocalDate.parse("2019-09-25");
		LocalDate endDate = LocalDate.parse("2021-10-31");
		
		int month = Period.between(startDate, endDate).getMonths();
		int days = Period.between(startDate, endDate).getDays();
		int years = Period.between(startDate, endDate).getYears();
		
		System.out.println("No of months : " + month);
		System.out.println("No of days : " + days);
		System.out.println("No of year : " + years);
		
		//LocalTime time1 = LocalTime.of(11, 20);
		//LocalTime time2 = LocalTime.of(days, years)
		
		LocalTime startTime = LocalTime.parse("11:30");
		LocalTime endTime = LocalTime.parse("12:00");
		
		long seconds = Duration.between(startTime, endTime).getSeconds();
		System.out.println("No of seconds : " + seconds);
		
		
	}

}
