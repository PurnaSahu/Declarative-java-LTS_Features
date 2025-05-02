package com.pbs.acc.ui;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class UITester02 {
	public static void main(String[] args) {
		Product minPriceProduct = ProductUtility.getAllProducts()
			.stream()
			.reduce((product1, product2) -> product1.getPrice() < product2.getPrice() ? product1 : product2)
			.orElse(new Product(0, null, 0, null, null, null));
		System.out.println(minPriceProduct);
		
		Product maxPriceProduct = ProductUtility.getAllProducts().stream()
												.reduce((prod1, prod2) -> prod1.getPrice()>prod2.getPrice() ? prod1:prod2)
												.orElse(new Product(0, null, 0, null, null, null));
		System.out.println(maxPriceProduct);
	}
}
