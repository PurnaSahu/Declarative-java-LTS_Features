package com.accenture.ltt.ui;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class UITester06 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();

		LocalDate birthDate = LocalDate.of(1987, 4, 25);
		
		long dayDifference = ChronoUnit.DAYS.between(birthDate, today);
		System.out.println(dayDifference);
		
		long monthDifference = ChronoUnit.MONTHS.between(birthDate, today);
		System.out.println(monthDifference);
	}
}
