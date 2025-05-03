package com.pbs.acc.ui;

import java.util.concurrent.*;
/*
 * Its not manadatory that in submit() -> we can only pass Callable, we can also pass Runnable interface
 */
public class UITester00 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        //lambda expression implementing the run() of Runnable
        Runnable task = () -> {
            System.out.println("Running task in thread 1st version: " + Thread.currentThread().getName());
        };

        executor.submit(task);
        executor.submit(task);
        
   //=========================================================================================================
        
        Future<?> submit1 = executor.submit(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running task in thread: " + Thread.currentThread().getName()+"thread "+Thread.currentThread().getState());
			}
		});
        System.out.println(submit1);
        
        Future<?> submit2 = executor.submit(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running task in thread: " + Thread.currentThread().getName()+"thread "+Thread.currentThread().getState());
			}
		});
        System.out.println(submit2);

        executor.shutdown();
    }
}
