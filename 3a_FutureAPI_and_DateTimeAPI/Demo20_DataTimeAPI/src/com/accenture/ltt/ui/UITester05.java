package com.accenture.ltt.ui;

import java.time.LocalDate;
import java.time.Period;

public class UITester05 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		LocalDate birthDate = LocalDate.of(1987, 4, 25);
		
		Period result = Period.between(birthDate, today);
		System.out.println(result.getYears());
		System.out.println(result.getMonths());
		System.out.println(result.getDays());
		
		System.out.println(result);
	}
}
