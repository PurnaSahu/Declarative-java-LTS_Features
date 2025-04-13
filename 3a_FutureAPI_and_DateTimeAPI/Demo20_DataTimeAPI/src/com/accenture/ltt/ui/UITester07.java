package com.accenture.ltt.ui;

import java.time.LocalDate;

public class UITester07 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();

		LocalDate expiryDate = today.plusDays(30);
		System.out.println(expiryDate);
	}
}
