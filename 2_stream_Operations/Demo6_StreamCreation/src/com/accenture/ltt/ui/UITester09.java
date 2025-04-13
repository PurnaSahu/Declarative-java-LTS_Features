
package com.accenture.ltt.ui;

import java.util.List;
import java.util.stream.Stream;

import com.accenture.ltt.bean.Product;
import com.accenture.ltt.bean.ProductUtility;

public class UITester09 {
	public static void main(String[] args) {
		List<Product> productList = ProductUtility.getAllProducts();
		Stream<Product> stream1 = productList.stream();
		stream1.forEach(System.out::println);
	}
}
