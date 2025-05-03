package com.pbs.acc.ui;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.pbs.acc.bean.ProductBean;
import com.pbs.acc.bean.StoreBean;
import com.pbs.acc.service.ProductServiceImpl;
import com.pbs.acc.service.StoreServiceImpl;

public class UITester06 {
	
	private static ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	private static StoreServiceImpl storeServiceImpl = new StoreServiceImpl();
	
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
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
		
		Future<Integer> result1 =  ex.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				return productServiceImpl.addProduct(productBeans);
			}
			
		});
		
	
		Future<Integer> result2 =  ex.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				return storeServiceImpl.addStore(storeBeans);
			}
			
		});
		
		
		Future<Integer> result3 =  ex.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				Thread.sleep(3000);
				result1.cancel(true);
				return -1;
//				try {
//					return result1.get();
//				}catch(CancellationException ce) {
//					System.out.println(ce);
//				}
//				return 0;
			}
		});
		
//		if(!result1.isCancelled())
//			System.out.println(result1.get());
		
		if(!result2.isCancelled())
			System.out.println(result2.get());
		
		if(!result3.isCancelled()) {
			System.out.println(result3.get());
		}
		ex.shutdown();
	}
}
