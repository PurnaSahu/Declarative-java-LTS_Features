package com.accenture.lkm.ui.tester.java9;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.accenture.lkm.sampleclasses.Product;

//Make sure JRE compliance is pointing to Java 9.
public class Tester1004Optional {
	public static void main(String[] args) {
		//stream() - Convert product names to upper case if product name exists otherwise return an empty Stream.
		//req1();
		
		//ifPresentOrElse() - Display product details if present.
		//req2();
		
		//or() - Get IPhone. If IPhone not present, get IPad. If IPad not present, get IPod.
		req3();
	}
	
	//-------------------------------------------------------------------------------------------------------------------------
	// stream() - Convert product names to upper case if product name exists otherwise return an empty Stream.
	// ------------------------------------------------------------------------------------------------------------------------
	private static void req1() {
		// case1: Product names exist. Uncomment below line and observe.
		//Optional<String> appleProductNames = Optional.of("IPhone, IPad, IPod");
		
		//case2: Product names don't exist. Uncomment below line and observe.
		Optional<String> appleProductNames = Optional.empty();
		
		// converts Optional to stream
	    List<String> listOfAppleProducts = appleProductNames.stream()
	    													.map(String::toUpperCase)
	    													.collect(Collectors.toList());
	    System.out.println("Apple products: " + listOfAppleProducts);
	}
	
	//-------------------------------------------------------------------------------------------------------------------------
	// Display product details if present.
	// ifPresentOrElse() - It combines all methods like ifPresent(), isPresent() and orElse() methods in a single method.
	//-------------------------------------------------------------------------------------------------------------------------
	private static void req2() {
		// Before ifPresentOrElse
		Optional<Product> optionalProduct1 = Optional.of(new Product(1, "TV", "O", 20000.0, LocalDate.of(2015, 5, 5), Arrays.asList("M1", "M2", "M3")));
		optionalProduct1.ifPresent(product -> System.out.println(product));
        if(optionalProduct1.isPresent()) {
            System.out.println(optionalProduct1.get());
        } else {
            System.out.println("Product not found.");
        }
        
		// Using ifPresentOrElse
		Optional<Product> optionalProduct2 = Optional.of(new Product(1, "TV", "O", 20000.0, LocalDate.of(2015, 5, 5), Arrays.asList("M1", "M2", "M3")));
		optionalProduct2.ifPresentOrElse(product -> System.out.println("Product found: " + product),
							                   () -> System.out.println("Product not found."));

		// As Optional is empty, product not found.
		Optional<Product> optionalProduct3 = Optional.empty();
		optionalProduct3.ifPresentOrElse(product -> System.out.println("Product found: " + product),
                                              () -> System.out.println("Product not found."));
	}

	//-------------------------------------------------------------------------------------------------------------------------
	// ifPresentOrElse() - Get IPhone. If IPhone not present, get IPad. If IPad not present, get IPod.
	//-------------------------------------------------------------------------------------------------------------------------
	private static void req3() {
		//case1: IPhone  presents. 
		Optional<Product> iphoneProduct1 = Optional.of(new Product(101, "IPhone", "N", 50000.0, LocalDate.now(), Arrays.asList("M1", "M2", "M3")));
		Optional<Product> myIphone =  iphoneProduct1.or(() -> Optional.of(new Product(101, "IPad", "N", 40000.0, LocalDate.now(), Arrays.asList("M1", "M2", "M3")))
                								    .or(() -> Optional.of(new Product(101, "IPod", "N", 30000.0, LocalDate.now(), Arrays.asList("M1", "M2", "M3")))));
		System.out.println(myIphone.get());

		//case2: IPhone does not present. Get IPad.
		Optional<Product> iphoneProduct2 = Optional.empty();
		Optional<Product> myIPaad = iphoneProduct2.or(() -> getIPaad())
				   								 .or(() -> getIPod());
		System.out.println(myIPaad.get());
		
		//case3: IPhone, IPad do not present. Get IPod.
		Optional<Product> iphoneProduct3 = Optional.empty();
		Optional<Product> ipadProduct3 = Optional.empty();
		Optional<Product> myIPod = iphoneProduct3.or(() -> ipadProduct3)
						   						 .or(() -> getIPod());
		
		System.out.println(myIPod.get());
	}
	
	private static Optional<Product> getIPaad() {
		return Optional.of(new Product(102, "IPad", "N", 40000.0, LocalDate.now(), Arrays.asList("M1", "M2", "M3")));
	}
	
	private static Optional<Product> getIPod() {
		return Optional.of(new Product(103, "IPod", "N", 30000.0, LocalDate.now(), Arrays.asList("M1", "M2", "M3")));
	}
}
