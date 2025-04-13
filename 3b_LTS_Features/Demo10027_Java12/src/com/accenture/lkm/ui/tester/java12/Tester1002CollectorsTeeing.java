package com.accenture.lkm.ui.tester.java12;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;

import com.accenture.lkm.sampleclasses.Product;
import com.accenture.lkm.sampleclasses.ProductUtility;

//Make sure JRE compliance pointing to JRE12.
public class Tester1002CollectorsTeeing {
    public static void main(String[] args) throws IOException {
        //Req1: Get average of product prices
    	req1();
    	
    	//Req2: Find costliest and cheapest product and then store both the products in a map.
    	//req2();
    }

    //--------------------------------------------------------------------------------------------------------------
    //Get average of product prices
    //--------------------------------------------------------------------------------------------------------------
	private static void req1() {
		double averagePrice = ProductUtility.getProductList()
											.stream()
                							.collect(Collectors.teeing(
                														Collectors.summingDouble(product -> product.getProductPrice()),
                														Collectors.counting(),
                														(sum, count) -> sum / count)
                									                  );

		System.out.println("Average product price: " + averagePrice);
	}
	
	
	//--------------------------------------------------------------------------------------------------------------
    //Find costliest and cheapest product and then store both the products in a map.
    //--------------------------------------------------------------------------------------------------------------
	private static void req2() {
		HashMap<String, Product> result = 
				ProductUtility.getProductList()
							  .stream()
							  .collect( 
							     Collectors.teeing(
							    		 			Collectors.maxBy(Comparator.comparing(Product::getProductPrice)),
							    		 			Collectors.minBy(Comparator.comparing(Product::getProductPrice)),
							    		 			(costlyProduct, cheapProduct) -> {
							    		 					HashMap<String, Product> map = new HashMap<>();
							    		 					map.put("Costly product", costlyProduct.get());
							    		 					map.put("Cheap product", cheapProduct.get());
							    		 					return map;
							    		 				}
							    		 )
							     );

		result.forEach((label, product) -> System.out.println(label + " ---> " + product));
	}
}