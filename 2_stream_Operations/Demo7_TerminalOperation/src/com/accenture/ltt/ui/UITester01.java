package com.accenture.ltt.ui;

import java.util.stream.Stream;

import com.accenture.ltt.bean.Product;
import com.accenture.ltt.bean.ProductUtility;

public class UITester01 {
	public static void main(String[] args) {
		Stream<Product> products = ProductUtility.getAllProducts().stream();
		//Object[] objs = products.toArray();
		//Product[] objs = products.toArray(size -> new Product[size]);
		Product[] objs = products.toArray(Product[]::new);
	}
}
