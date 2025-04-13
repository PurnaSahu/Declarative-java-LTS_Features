package com.accenture.lkm.ui.tester.java16;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

//Make sure JRE compliance pointing to JRE16.

public class Tester1005StreamToList {
	public static void main(String[] args) {
		//Before Java 16
		Stream<Product> productStream1 = ProductUtility.getProductList().stream();
		List<String> productNames = productStream1.map(Product::productName)
												 .collect(Collectors.toList());
		System.out.println(productNames);
		
		//After Java 16
		Stream<Product> productStream2 = ProductUtility.getProductList().stream();
		List<String> productNames2 = productStream2.map(Product::productName)
				 								   .toList();
		System.out.println(productNames2);
	}
}