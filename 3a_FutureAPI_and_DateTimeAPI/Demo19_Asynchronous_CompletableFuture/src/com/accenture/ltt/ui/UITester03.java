package com.accenture.ltt.ui;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

import com.accenture.ltt.bean.ProductBean;
import com.accenture.ltt.bean.StoreBean;
import com.accenture.ltt.service.ProductServiceImpl;
import com.accenture.ltt.service.StoreServiceImpl;

public class UITester03 {
	
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
		
		
		ExecutorService ex = Executors.newFixedThreadPool(5);
		
		CompletableFuture<Integer> result1 = CompletableFuture.supplyAsync(() -> {
				int productCount = 0;
				try {
					productCount = productServiceImpl.addProduct(productBeans);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				return productCount;
		}, ex);
		
		
		CompletableFuture<String> transformedResult =  result1
				.thenApplyAsync(productCount -> "Products created are: "+productCount);
		
		transformedResult.thenAcceptAsync(System.out::println);
		
		
		ex.shutdown();
		
	}
}
