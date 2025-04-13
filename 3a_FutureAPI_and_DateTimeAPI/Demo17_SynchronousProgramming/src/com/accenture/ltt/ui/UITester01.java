package com.accenture.ltt.ui;

import java.util.Arrays;
import java.util.List;

import com.accenture.ltt.bean.ProductBean;
import com.accenture.ltt.bean.StoreBean;
import com.accenture.ltt.service.ProductServiceImpl;
import com.accenture.ltt.service.StoreServiceImpl;

public class UITester01 {
	
	private static ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	private static StoreServiceImpl storeServiceImpl = new StoreServiceImpl();
	
	public static void main(String[] args) throws InterruptedException {
		List<ProductBean> productBeans = Arrays.asList(
				new ProductBean(1001, "TV"), 
				new ProductBean(1002, "Fan"),
				new ProductBean(1003, "Mobile"), 
				new ProductBean(1004, "Laptop"));

		List<StoreBean> storeBeans = Arrays.asList(
				new StoreBean(2001, "Croma"), 
				new StoreBean(2002, "Vijay sales"),
				new StoreBean(2003, "Galaxy"), 
				new StoreBean(2004, "Hometown"));
		
		
		Integer result1 = productServiceImpl.addProduct(productBeans);
		Integer result2 = storeServiceImpl.addStore(storeBeans);
		
		System.out.println(result1 + " products and " + result2 + " stores are created");
		
	}
}
