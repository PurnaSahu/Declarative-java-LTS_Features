package com.accenture.lkm.ui.tester.java16;

import java.time.LocalDate;

import com.accenture.lkm.sampleclasses.Product3;

//Make sure JRE compliance pointing to JRE16.


public class Tester1003Record {
	public static void main(String[] args) {
		Product3 product = new Product3(101, "New Product", "N", 0.0, LocalDate.now());
	}
}