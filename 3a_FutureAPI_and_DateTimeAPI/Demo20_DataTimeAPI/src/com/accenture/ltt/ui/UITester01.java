package com.accenture.ltt.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UITester01 {
	public static void main(String[] args) {
		LocalDate localDate1 = LocalDate.now();
		System.out.println(localDate1);						//yyyy-MM-dd
		
		
		LocalDateTime localDateTime1 = LocalDateTime.now();
		System.out.println(localDateTime1);
		
		
		LocalDate date2 = LocalDate.of(1987, 4, 25);
		System.out.println(date2);
		
		LocalDate date3 = LocalDate.now().withYear(1987).withMonth(4).withDayOfMonth(25);
		System.out.println(date3);
		
		LocalDateTime localDateTime2 = LocalDateTime.of(1987, 04, 25, 6, 10);
		System.out.println(localDateTime2);
	}
}
