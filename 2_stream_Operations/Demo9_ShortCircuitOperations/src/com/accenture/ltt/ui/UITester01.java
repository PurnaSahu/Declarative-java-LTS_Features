package com.accenture.ltt.ui;

import java.util.stream.Stream;

import com.accenture.ltt.bean.Product;
import com.accenture.ltt.bean.ProductUtility;

public class UITester01 {
	public static void main(String[] args) {
		Stream<Product> products = ProductUtility.getAllProducts().stream();
		Product p = products.filter(product -> product.getPrice() > 50000)
				.findFirst()
				.orElse(new Product(0, null, 0, null, null));
		System.out.println(p);
		
		
		Stream<Product> products1 = ProductUtility.getAllProducts().stream();
		Product p1 = products1.filter(product -> product.getManufacturingDate().getYear() == 2015)
				.findAny()
				.orElse(new Product(0, null, 0, null, null));
		System.out.println(p1);
		
		
		Stream<Product> products2 = ProductUtility.getAllProducts().stream();
		boolean result = products2.anyMatch(product -> product.getManufacturingDate().getYear() == 2015);
		System.out.println(result);
		
		
		Stream<Product> products3 = ProductUtility.getAllProducts().stream();
		boolean result1 = products3.allMatch(product -> product.getManufacturingDate().getYear() == 2015);
		System.out.println(result1);
		
		
		Stream<Product> products4 = ProductUtility.getAllProducts().stream();
		boolean result2 = products4.noneMatch(product -> product.getManufacturingDate().getYear() == 2015);
		System.out.println(result2);
	}
}
