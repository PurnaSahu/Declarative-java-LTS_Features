package com.pbs.acc.ui;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class UITester05 {
	public static void main(String[] args) {
		//Collect the stream elements in a Map having id as key & name as value
		//no duplicate keys
		/*
		 * There are 2 ways, 1 we collect data and manually insert them in Map, or we can collect certain data from different 
		 * datastructure and by calling toMap() inside collect(), we can create our own HashMap
		 * 
		 * By default it return HashMap<>, but if we want the map to be in a order, so we can also pass another parameter by saying 
		 * what type of data we want to return
		 */
		
		Stream<Product> products = ProductUtility.getAllProducts().stream();
		Map<Integer, String> map = products.collect(
													Collectors.toMap(product -> product.getProductId(), 
																	product -> product.getProductName()));
		map.forEach((key, value)->System.out.println(key+" - "+value));
	} 
}
