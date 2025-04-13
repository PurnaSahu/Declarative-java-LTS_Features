package com.accenture.lkm.ui;

import java.time.LocalDate;

import com.accenture.lkm.bean.Product;

public class Tester1001_TestModule {
	public static void main(String[] args) {
		Product product = new Product(1, "Mobile", "N", 30000.0, LocalDate.now());
		product.printDetails();
	}
}
