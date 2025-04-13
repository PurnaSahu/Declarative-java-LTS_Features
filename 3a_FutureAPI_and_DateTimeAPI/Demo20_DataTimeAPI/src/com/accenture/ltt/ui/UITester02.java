package com.accenture.ltt.ui;

import java.time.LocalDate;

public class UITester02 {
	public static void main(String[] args) {
		String date = "1999-05-23";
		
		LocalDate localDate = LocalDate.parse(date);
		System.out.println(localDate);
	}
}
