package com.pbs.acc.ui;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.pbs.acc.bean.ProductBean;
import com.pbs.acc.bean.StoreBean;
import com.pbs.acc.service.ProductServiceImpl;
import com.pbs.acc.service.StoreServiceImpl;

public class UITester04 {
	
	private static ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	private static StoreServiceImpl storeServiceImpl = new StoreServiceImpl();
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<ProductBean> productBeans = Arrays.asList(
				new ProductBean(1001, "TV"), 
				new ProductBean(1002, "Fan"),
				new ProductBean(1003, "Mobile"), 
				new ProductBean(1004, "Laptop"),
				new ProductBean(1005, "Dresses"));

		List<StoreBean> storeBeans = Arrays.asList(
				new StoreBean(2001, "Croma"), 
				new StoreBean(2002, "Vijay sales"),
				new StoreBean(2003, "Galaxy"), 
				new StoreBean(2004, "Hometown"));
		
		
		ExecutorService ex = Executors.newFixedThreadPool(5);
		/*
		 * Instead passing the Callable implementation as Anonymous class, we can create separate Callables for each tasks and invoke
		 * all Callable services at a time
		 */
		Callable<Integer> productTask = ()-> {
				return productServiceImpl.addProduct(productBeans);
		};	
		
	
		Callable<Integer> storeTask =  () ->  {
				return storeServiceImpl.addStore(storeBeans);
		};

		List<Callable<Integer>> listCallables = Arrays.asList(productTask, storeTask);
		
		/*
		 * invokeAll() does internally use submit()-like behavior to submit multiple tasks to an executor service.
		 * 
		 * Submits all the Callable tasks in the list — just like doing multiple submit(callable), 
		   Waits (blocks) until all tasks complete and Returns a List<Future<T>> — one future per task
		 */
		List<Future<Integer>> listFutures = ex.invokeAll(listCallables);
		
		listFutures.stream().forEach(future -> {
			/*
			 *  here, we safely fetching the thread responses, instead of directly calling get(), we checking the status first, 
			 *  so now my main thread will not get blocked, it will by pass even though the result not available main 
			 *  thread will continue the work independently and t1, t2 thread will also finish their jobs and shutdown.
			 */

			if(future.isDone()) {
				try {
					System.out.println(future.get());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		ex.shutdown();
	}
}
