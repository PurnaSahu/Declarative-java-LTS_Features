package com.accenture.ltt.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductUtility {
	public static List<Product> getAllProducts(){
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "Mobile"));
		productList.add(new Product(2, "Washing Machine"));
		productList.add(new Product(3, "HeadPhone"));
		productList.add(new Product(4, "TV"));
		productList.add(new Product(5, "IPod"));
		return productList;
	}
}
