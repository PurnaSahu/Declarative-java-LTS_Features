package com.accenture.ltt.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UITester03 {
	public static void main(String[] args) {
		String date = "Jan-03-1987";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
		LocalDate localDate = LocalDate.parse(date, formatter);
		System.out.println(localDate);
	}
}
