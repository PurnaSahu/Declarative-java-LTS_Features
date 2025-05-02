package com.pbs.acc.ui;

import java.util.function.Predicate;
import java.util.stream.Stream;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class UITester01 {
	public static void main(String[] args) {
		Stream<Product> products = ProductUtility.getAllProducts().stream();
		Product p = products.filter(product -> product.getPrice() > 50000)
				//.peek(prod -> System.out.println(prod))
				.findFirst()
				.orElse(new Product(0, null, 0, null, null));
		System.out.println(p+"==============");
		
		
		Stream<Product> products1 = ProductUtility.getAllProducts().stream();
		Product p1 = products1.filter(product -> product.getManufacturingDate().getYear() == 2020)
				.findAny()
				.orElseGet(() -> new Product(-1, "NA", 0.0, "NA", null));
		System.out.println(p1);
		
		
		Stream<Product> products2 = ProductUtility.getAllProducts().stream();
		boolean result = products2.anyMatch(product -> product.getManufacturingDate().getYear() == 2015);
		System.out.println(result);
		
		
		Stream<Product> products3 = ProductUtility.getAllProducts().stream();
		boolean result1 = products3.allMatch(product -> product.getManufacturingDate().getYear() == 2015);
		System.out.println(result1);
		
		
		Stream<Product> products4 = ProductUtility.getAllProducts().stream();
		boolean result2 = products4.noneMatch(new Predicate<Product>() {
			@Override
			public boolean test(Product t) {
				boolean status = t.getManufacturingDate().getYear() == 2010;
				return status;
			}
		});
		System.out.println(result2);
	}
}
