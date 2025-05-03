package com.pbs.acc.ui;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
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

public class UITester05 {
	
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
				new StoreBean(2004, "Hometown"),
				new StoreBean(2005, "Pentaloon"),
				new StoreBean(2006, "CMR Mall"));
		
		
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
		
		/*
		 * Here, thread1(t1) and thread2(t2) already started but main thread is not waitting for them to finish the job, 
		   it keep processing, but when we call the get() on result1, main thread will check whether thread1 has finished the job, 
		   if not then main thread will go to block state but we are not waitting, untill t1 finish the works, here we are waiting 
		   for 6sec, after that irrespective of the status of t1 thread, main thread will proceed
		   
		   but this time main thread will check result2-> if thread2 not yet finished job then definitely main thread will be blocked
		   until t2 finish the work
		   
		   but 1 condition, when we call get(with timer), we have to handle the "TimeoutException" otherwise main thread will be 
		   interrupted right there by throwing the exception but thread1 & thread2 will finish their job. and as wkt the main
		   thread will end so no one is there to run the ex.shutDown(), hence it will keep on running
		 */
		
		try {
			System.out.println(result1.get(6, TimeUnit.SECONDS));
		}catch(TimeoutException te){
			System.out.println(te);
		}
		System.out.println(result2.get());
		
		ex.shutdown();
	}
}
