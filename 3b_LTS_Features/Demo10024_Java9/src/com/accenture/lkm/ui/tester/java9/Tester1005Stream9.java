package com.accenture.lkm.ui.tester.java9;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

//Make sure JRE compliance is pointing to Java 9.
public class Tester1005Stream9 {
	public static void main(String[] args) {
		//takeWhile() - Get the products until product price is > 30000. 
		//req1();
		
		//dropWhile() - Get the product having price 90000.
		req2();
		
		//iterate() - Get all the products where product names contains 'I'.
		//req3();
		
		//ofNullable() - Collect non-null products.
		//req4();
	}

	//-------------------------------------------------------------------------------------------------------------------------
	//Get the products until product price is > 30000. Comment line no 33 from ProductUtility.java
	//takeWhile() - Evaluates all the values until the predicate returns false. 
	//Case1 : If the stream is sorted, returns a stream consisting of the remaining elements of this stream after taking the
	//contiguous sequence of elements of this stream that match the given predicate.
	//Case2: If the stream is unsorted, returns a stream consisting of the remaining elements of this stream after dropping a subset of 
	//elements that match the given predicate.
	//-------------------------------------------------------------------------------------------------------------------------
	private static void req1() {
		//Stream<Product> products = ProductUtility.getProductList().stream(); 
		//products.takeWhile(product -> product.getProductPrice() <= 30000).forEach(product -> product.printDetails());
		//Case 1:
		/*ProductUtility.getProductList()
				      .stream()
				      .sorted(Comparator.comparingDouble(Product::getProductPrice))
				      .takeWhile(product -> product.getProductPrice() <= 30000).forEach(product -> product.printDetails());*/
		
		//Case 2:
		ProductUtility.getProductList()
	                  .stream()
	                  .takeWhile(product -> product.getProductPrice() <= 30000).forEach(product -> product.printDetails());
	}
	
	//-------------------------------------------------------------------------------------------------------------------------
	//Get the product having price 90000. Comment line no 33 from ProductUtility.java
	//dropWhile() - 
	//Case1 : If the stream is sorted, returns a stream consisting of the remaining elements of this stream after dropping the
	//contiguous sequence of elements of this stream that match the given predicate.
	//Case2: If the stream is unsorted, returns a stream consisting of the remaining elements of this stream after dropping a subset of 
	//elements that match the given predicate.
	//-------------------------------------------------------------------------------------------------------------------------
	private static void req2() {
		//Case1: 
		ProductUtility.getProductList()
					  .stream()
					  .sorted(Comparator.comparingDouble(Product::getProductPrice))
					  .dropWhile(product -> product.getProductPrice() != 90000)
					  .forEach(product -> product.printDetails());
		
		System.out.println("---------------------------------------------------");
		
		//Case2: 
		/*Stream<Product> products2 = ProductUtility.getProductList()
												  .stream()
												  .dropWhile(product -> product.getProductPrice() != 90000);
		products2.forEach(product -> product.printDetails());*/
	}
	
	//-------------------------------------------------------------------------------------------------------------------------
	//Get all the products where product names contains 'I'. Comment line no 33 from ProductUtility.java
	//iterate() - iterate() has predicate as parameter which stops the loop once predicate returns false.
	//-------------------------------------------------------------------------------------------------------------------------
	private static void req3() {
		List<String> productNames = ProductUtility.getProductNameList();
		Stream.iterate(0, index -> index<productNames.size(), index -> ++index)
			  .filter(index -> productNames.get(index).contains("I"))
			  .forEach(index -> System.out.println(productNames.get(index)));
	}
	
	//-------------------------------------------------------------------------------------------------------------------------
	//Collect non-null products. Uncomment line no 33 from ProductUtility.java.
	//ofNullable() - Returns a sequential Stream containing a single element if parameter which is passed is not-null, 
	//               otherwise returns an empty Stream.
	//-------------------------------------------------------------------------------------------------------------------------
	private static void req4() {
		// Uncomment line no 33 in ProductUtility.java and observe that null products are printed. 
		List<Product> productsList = ProductUtility.getProductList();
		productsList.stream().forEach(System.out::println);
		
		// Uncomment line no 33 in ProductUtility.java and observe that null products are not printed. 
		Stream<Product> nonNullPrducts = productsList.stream().flatMap(prdElement -> Stream.ofNullable(prdElement));
		nonNullPrducts.forEach(System.out::println);
	}
}
		
		
		
    
		
		
		
