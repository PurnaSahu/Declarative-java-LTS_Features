package com.pbs.acc;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.function.Consumer;

public class UITester01 {
	public static void main(String[] args) throws ProductNotAvailableException {
		method9();
	}
	
	/*
	 * when we getting Product data from DB, but we dont know whether we got actually data or Null value(nothing found), so we check
	 * if Product product == NULL -> return Optional.empty();
	 * 
	 * It returns an empty Optional object — one that does not contain any value inside it.
		So instead of setting a variable to null, we can safely use Optional.empty() to explicitly represent "no value" 
		to avoid risking a NullPointerException.
	 * */
	public static void method1() {
		Optional<Product> optional = Optional.empty();
		if(!optional.isPresent()) {
			System.out.println("Welcome");
		}
	}
	
	public static void method2() {
		//String productName = "Television";
		String productName = null;
		
		Optional<String> prdName = Optional.of(productName);
		System.out.println(prdName.isPresent());	//NullPointerException
	}
	
	public static void method3() {
		//String productName = "Television";
		String productName = null;
		
		Optional<String> prdName = Optional.ofNullable(productName);
		System.out.println(prdName.isPresent());		//false
	}
	
	public static void method4() {
		Product prod = new Product(null,null,null, null, null);
				//new Product(2,"Android","N", 35000.0,  LocalDate.of(2000, 12, 12));
				//new Product(null,null,null, null, null);
		
		Optional<Product> optionalProduct = Optional.of(new Product(1, "IPhone", "O", 40000.0, LocalDate.of(2000, 12, 12)));
		Optional<Product> secondProduct= Optional.of(prod);
		Product product = secondProduct.get();
		System.out.println(product);
	}
	
	public static void method5() {
		Optional<Product> optionalProduct = Optional.empty();	
		Product product = optionalProduct.get();			//NoSuchElementException
		System.out.println(product);
	}
	
	/*
	 * Here, ifPresent(Consumer c)-> consumes data but don't return anything, here it took the product object and checked if product 
	 * is empty/NULL, if not then only accept the data
	 * */
	public static void method6() {
		Optional<Product> optionalProduct = Optional.of(new Product(1, "IPhone", "O", 40000.0, LocalDate.of(2000, 12, 12)));	
		//Optional<Product> optionalProduct = Optional.empty();
		
		//lambda style
		optionalProduct.ifPresent(product -> System.out.println(product.getProductName()));
		
		//same code written anonymous class style, so basically the point is we have to pass Anonymous reference of Consumer FI
		optionalProduct.ifPresent(new Consumer<Product>() {
			
			@Override
			public void accept(Product t) {
				System.out.println(t.getProductName());
				
			}
		});
	}
	
	public static void method9() {
		Optional<Product> optionalProduct = Optional.of(new Product(1, "IPhone", "O", 40000.0, LocalDate.of(2000, 12, 12)));
		Optional<Product> optionalProduct1 = Optional.empty();
		
		optionalProduct.ifPresentOrElse(product-> System.out.println(product), 
				()-> System.out.println("Ooops !! there are no products to show..."));
		
		//we can also throw error
		optionalProduct1.ifPresentOrElse(product-> System.out.println(product), 
				()-> {throw new RuntimeException("throwing intentionally");});
	}
	
	/*
	 * Its bit different from orElseThrow()-> here it won't throw any exception, it will return a default data
	 * */
	public static void method7() {
		//Optional<Product> optionalProduct = Optional.of(new Product(1, "IPhone", "O", 40000.0, LocalDate.of(2000, 12, 12)));	
		Optional<Product> optionalProduct = Optional.empty();
		Product product = optionalProduct.orElse(new Product(null, null, null, null, null));
		System.out.println(product);
	}
	
	/*
	 * here, orElseThrow()-> takes supplier means, takes no arguments but returns something. so we passed the supplier which will 
	 * return a reference of our custom exception
	 * ProductNotAvailableException::new gives a new object, but orElseThrow() throws it, not returns it.
	 * */
	public static void method8() throws ProductNotAvailableException {
		//Optional<Product> optionalProduct = Optional.of(new Product(1, "IPhone", "O", 40000.0, LocalDate.of(2000, 12, 12)));	
		Optional<Product> optionalProduct = Optional.empty();
		//Product product = optionalProduct.orElseThrow(ProductNotAvailableException :: new);
		Product orElseThrow = optionalProduct.orElseThrow(()-> new 
				ProductNotAvailableException("the product seems empty or found nothing", LocalDateTime.now())); //-> lamda expression
		System.out.println(orElseThrow);
	}
}
