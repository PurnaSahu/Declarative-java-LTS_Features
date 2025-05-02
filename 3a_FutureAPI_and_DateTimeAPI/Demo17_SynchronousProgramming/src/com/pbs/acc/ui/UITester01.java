package com.pbs.acc.ui;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import com.pbs.acc.bean.ProductBean;
import com.pbs.acc.bean.StoreBean;
import com.pbs.acc.service.ProductServiceImpl;
import com.pbs.acc.service.StoreServiceImpl;

public class UITester01 {
	
	private static ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	private static StoreServiceImpl storeServiceImpl = new StoreServiceImpl();
	
	public static void main(String[] args) throws InterruptedException {
		List<ProductBean> productBeans = Arrays.asList(
				new ProductBean(1001, "TV"), 
				new ProductBean(1002, "Fan"),
				new ProductBean(1003, "Mobile"), 
				new ProductBean(1004, "Laptop"),
				new ProductBean(1005, "dress"),
				new ProductBean(1006, "watches"),
				new ProductBean(1007, "shooes"),
				new ProductBean(1008, "kids-dresses"),
				new ProductBean(1009, "home-equipement"));

		List<StoreBean> storeBeans = Arrays.asList(
				new StoreBean(2001, "Croma"), 
				new StoreBean(2002, "Vijay sales"),
				new StoreBean(2003, "Galaxy"), 
				new StoreBean(2005, "Vishal mega mart"),
				new StoreBean(2006, "Pentaloon"),
				new StoreBean(2007, "CMR mall"),
				new StoreBean(2004, "Lohiya"));
		
		LocalTime now1 = LocalTime.now();
		/*
		 * Here, main thread will 1st finish addProduct() service and after that the main thread will sequentially 
		 * run the addStore() service
		 */
		Integer result1 = productServiceImpl.addProduct(productBeans);
		Integer result2 = storeServiceImpl.addStore(storeBeans);
		LocalTime now2 = LocalTime.now();
		Duration between = Duration.between(now1, now2);
		String message = between.toMinutes()%60+" minutes "+ between.getSeconds() % 60+" second "+between.toMillis() % 1000+" milisec" ;
		
		System.out.println("Time started: "+now1+" Time ended: "+now2+" and time taken: "+message);
		System.out.println(result1 + " products and " + result2 + " stores are created");
		
	}
}
