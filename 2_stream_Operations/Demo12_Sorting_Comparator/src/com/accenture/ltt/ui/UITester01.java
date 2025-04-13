package com.accenture.ltt.ui;

import com.accenture.ltt.bean.NameComparator;
import com.accenture.ltt.bean.PriceComparator;
import com.accenture.ltt.bean.ProductUtility;

public class UITester01 {
	public static void main(String[] args) {
		ProductUtility.getAllProducts()
			.stream()
			.sorted(new PriceComparator())
			.forEach(System.out::println);
	}
}
