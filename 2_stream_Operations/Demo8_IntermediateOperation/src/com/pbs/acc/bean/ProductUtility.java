package com.pbs.acc.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductUtility {
	public static List<Product> getAllProducts(){
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "Mobile", 12345,"O"));
		productList.add(new Product(2, "Washing Machine", 12000,"O"));
		productList.add(new Product(3, "HeadPhone", 1000,"N"));
		productList.add(new Product(4, "TV", 56000,"O"));
		productList.add(new Product(5, "IPod", 67000,"N"));
		productList.add(new Product(5, "Monitor", 29000,"N"));
		return productList;
	}
	
	public static List<Integer> getPrimitiveData(){
		
		List<Integer> data = Arrays.asList(21,32,43,45,32,21,45);
		return data;
	}
}
