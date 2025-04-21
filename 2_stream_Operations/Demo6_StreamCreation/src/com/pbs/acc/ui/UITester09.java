
package com.pbs.acc.ui;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class UITester09 {
	public static void main(String[] args) {
		
		
		List<Product> productList = ProductUtility.getAllProducts();
		Stream<Product> stream1 = productList.stream();
		stream1.forEach(System.out::println);
		
		//=========================================================================================
		
		ProductUtility.getAllProducts().stream().forEach(new Consumer<Product>() {
			int counter=0;
			@Override
			public void accept(Product p) {
				
				if(!p.getProductName().isEmpty() && p!= null)
					System.out.println("product "+(++counter)+" : "+p.getProductId()+" -> "+p.getProductName());
			}
		});
		
		//======================================================================================
		
		ProductUtility.getAllProducts().stream().forEach((product) -> System.out.println(product));
	}
}
