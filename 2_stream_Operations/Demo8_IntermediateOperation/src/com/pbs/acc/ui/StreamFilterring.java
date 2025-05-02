package com.pbs.acc.ui;

import java.util.List;
import java.util.stream.Collectors;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class StreamFilterring {
	public static void main(String[] args) {
		
		//********************************************Problem-01******************************************************
		// 1. print the product details whose price<30000.
		
		ProductUtility.getAllProducts()
			.stream()
			.filter(product -> product.getPrice() < 30000)
			.forEach(System.out::println);
		
		
		ProductUtility.getAllProducts()
			.stream()
			//.filter(UITester01::checkProductPrice)
			.filter((product) -> StreamFilterring.checkProductPrice(product))
			.forEach(System.out::println);
		
		//********************************************Problem-02*******************************************************
		/**
		 * Qus2: print the product details whose price<30000 and product name starts with 'M'.
		 */
		System.out.println("_________________________________________");
		ProductUtility.getAllProducts()
			.stream()
			.filter(product -> product.getProductName().startsWith("M") && product.getPrice() < 30000)
			.forEach(System.out::println);
		
		
		System.out.println("_________________________________________");
		ProductUtility.getAllProducts()
			.stream()
			.filter(product -> product.getProductName().startsWith("H"))
			.filter(product -> product.getPrice() < 30000)
			.forEach(System.out::println);
		
		
		//********************************************Problem-02*******************************************************
		/**
		* Qus3: print the product details whose price<30000 and product name starts with 'M', but return the stream of result to
		* 		the required datastructure
		*/
		System.out.println("_________________________________________");
		List<Product> matches = ProductUtility.getAllProducts()
			.stream()
			.filter(product -> product.getProductName().startsWith("M"))
			.filter(product -> product.getPrice() < 30000)
			.collect(Collectors.toList());
		System.out.println(matches);
	}
	
	public static boolean checkProductPrice(Product product) {
		return product.getPrice() < 30000;
	}
}
