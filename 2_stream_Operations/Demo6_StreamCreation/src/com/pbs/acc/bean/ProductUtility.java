package com.pbs.acc.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductUtility {
	public static List<Product> getAllProducts(){
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(101, "Mobile"));
		productList.add(new Product(102, "Washing Machine"));
		productList.add(new Product(103, "HeadPhone"));
		productList.add(new Product(104, "TV"));
		productList.add(new Product(105, "IPod"));
		productList.add(new Product(106," "));
		productList.add(new Product(107, ""));
		productList.add(new Product(104, "laptop"));

		return productList;
	}
}
