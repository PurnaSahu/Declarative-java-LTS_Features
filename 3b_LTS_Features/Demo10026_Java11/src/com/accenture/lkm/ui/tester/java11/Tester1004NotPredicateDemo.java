package com.accenture.lkm.ui.tester.java11;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

//Note: Make sure jre compliance is Java 11. 
public class Tester1004NotPredicateDemo {
	public static void main(String[] args) {
        //Create a separate list of the products having even and odd product ids.
		List<Product> products = ProductUtility.getProductList();
        Predicate<Product> evenProductId = product -> product.getProductId() % 2 == 0;
        Predicate<Product> oddProductId = Predicate.not(evenProductId);
        
        List<Product> evenidProducts = products.stream()
                    						   .filter(evenProductId)
                    						   .collect(Collectors.toList());
        
        List<Product> oddidProducts = products.stream()
        									  .filter(oddProductId)
        									  .collect(Collectors.toList());
        
        System.out.println("Even id products: ");
        evenidProducts.forEach(product -> product.printDetails());
        
        System.out.println("\nOdd id products: ");
        oddidProducts.forEach(product -> product.printDetails());
	}
}
