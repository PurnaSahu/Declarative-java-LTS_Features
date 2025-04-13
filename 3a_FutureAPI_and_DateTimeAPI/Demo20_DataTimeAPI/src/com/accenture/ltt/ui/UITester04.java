package com.accenture.ltt.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class UITester04 {
	public static void main(String[] args) {
//		DateTimeFormatter formatter = 
//				DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
//		String value = LocalDate.now().format(formatter);
//		System.out.println(value);
//		
		
		DateTimeFormatter formatter1 = 
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		ZonedDateTime zonedDateTime = LocalDateTime.now().atZone(ZoneId.of("Asia/Calcutta"));
		System.out.println(zonedDateTime.format(formatter1));
	}
}
