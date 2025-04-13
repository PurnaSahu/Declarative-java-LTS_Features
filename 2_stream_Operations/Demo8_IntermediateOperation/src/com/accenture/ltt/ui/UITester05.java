package com.accenture.ltt.ui;

import com.accenture.ltt.bean.ProductUtility;

public class UITester05 {
	public static void main(String[] args) {
		
		ProductUtility.getAllProducts().stream()
		.skip(3)
		.forEach(System.out::println);
			
	}
}
