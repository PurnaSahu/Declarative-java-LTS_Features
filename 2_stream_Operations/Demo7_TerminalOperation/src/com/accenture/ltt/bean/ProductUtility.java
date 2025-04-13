package com.accenture.ltt.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductUtility {
	public static List<Product> getAllProducts(){
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "Mobile", 12345));
		productList.add(new Product(2, "Washing Machine", 12000));
		productList.add(new Product(3, "HeadPhone", 1000));
		productList.add(new Product(4, "TV", 56000));
		productList.add(new Product(5, "IPod", 67000));
		productList.add(new Product(4, "Television", 56000));
		return productList;
	}
}
