package com.accenture.lkm.ui.tester.java9;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

/**
 * 
 * 
 *
 */

//Make sure JRE compliance is pointing to Java 9.
public class Tester1008Collectors {
    public static void main(String... args) {
    	//Req1:  Collect all products having price >=30000 grouped by product category
    	//req1();
    	
    	//Req2: Collect all manufacturers in each category.
    	req2();
    }

    
	//-------------------------------------------------------------------------------------------------------------------------
    //Collect all products having price >=30000 grouped by product category. Comment line no 33 in ProductUtility.java
    //-------------------------------------------------------------------------------------------------------------------------
    private static void req1() {
    	Stream<Product> productStream = ProductUtility.getProductList().stream();
        Map<String, Set<Product>> productsByCategory =
        		productStream.collect(
        									Collectors.groupingBy(
        											Product::getProductCategory,
        											Collectors.filtering(product -> product.getProductPrice() > 30000,
        																  Collectors.toSet()
        										    )
        								    )
        							  );
        productsByCategory.forEach((category, products) -> {
        														System.out.println(category);
        														System.out.println(products);
        });
	}
    
    
    //-------------------------------------------------------------------------------------------------------------------------
    //Collect all manufacturers in each category. Comment line no 33 in ProductUtility.java.
    //-------------------------------------------------------------------------------------------------------------------------
    private static void req2() {
    	Stream<Product> productStream = ProductUtility.getProductList().stream();
        Map<String, Set<String>> manufacturers = 
        		productStream.collect(
        								Collectors.groupingBy(
        											Product::getProductCategory,
        											Collectors.flatMapping(
        															product -> product.getManufacturers().stream(), 
        															Collectors.toSet()
        														)
        										 )
        							);
        manufacturers.forEach((category, manufacturer) -> {
															System.out.println(category);
															System.out.println(manufacturer);
        					});
	}
}
		

