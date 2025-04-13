package com.pbs.acc.ui;

import com.pbs.acc.ProductBiConsumer;
import com.pbs.acc.ProductConsumer;
import com.pbs.acc.ProductFunction;
import com.pbs.acc.ProductPredicate;
import com.pbs.acc.ProductSupplier;
import com.pbs.acc.businessbean.Product;

public class UITester01 {
	public static void main(String[] args) {
		
		Product prod= new Product();
		
/***********************providing implementation of Consumer FI in 2 ways(lambda & Anonymous)**********************/
		
		ProductConsumer consumer = 
				(name) -> new Product().printProductNameUpper(name);
		consumer.printNameInUpper("divya");
		
		
		
		ProductConsumer consu= new ProductConsumer() {
			
			@Override
			public void printNameInUpper(String name) {
				/* 
				 * here, we only passing parameters to our abstract method of ProductConsumer FI, 
				 * we can do whatever with the data we passed as parameter, but we can not return anything after data processing
				 * 
				 * Usually when we provide implementation to our Abstract method defined in Interface by lamda 
				 * expression or by Anonymous class , we provide the behaviour or implementation, but in this case we are
				 * not doing so, coz the implementation we have written already in our Product/Entity class, we will use that
				 */
				prod.printProductNameUpper(name);
			}
		};
		//System.out.println(consu.);
		
		//so, far we only gave the implementation in above overrided method, inorder to test it we have to call that method,
		//using the Anonymous Object reference
		consu.printNameInUpper("purna brahma sahu & rina rani sahu \t are friendS... ");
		
//===========================================================================================================
		
		
/***********************providing implementation of Predicate FI in 2 ways(lambda & Anonymous)**********************/
		ProductPredicate predicate = 
				(category) -> new Product().productCategory(category);
		boolean result = predicate.isProductCategory("electronics");
		System.out.println(result);
		
		
		
		ProductPredicate pred= new ProductPredicate() {
			
			// writing the implementation for the abstract method of Custom Predicate FI by Anonymous class
			@Override
			public boolean isProductCategory(String category) {
				return prod.productCategory(category);
			}
		};
		System.out.println("data matching? "+pred.isProductCategory("electronicss"));
		
		
//===========================================================================================================
		ProductSupplier supplier = () -> new Product().returnProductName();
		System.out.println(supplier.returnName());
		
		ProductSupplier supp = new ProductSupplier() {
			
			@Override
			public String returnName() {
				
				return prod.returnProductName();
			}
		};
		
//=======================================================================================================
		
		ProductFunction function = 
				(name) -> new Product().returnProductNameLength(name);
		System.out.println(function.returnLengthOfName("mobile"));
		
		
		ProductFunction func= new ProductFunction() {
			
			@Override
			public Integer returnLengthOfName(String name) {
				
				return prod.returnProductNameLength(name);
			}
		};
		System.out.println(func.returnLengthOfName("purna brahma sahu & rina rani sahu \t are friendS... "));
		
//======================================================================================================
		
		ProductBiConsumer biConsumer = 
				(id, name) -> new Product().printProductDetails(id, name);
		biConsumer.printDetails(1001, "Divya");
		
		
		ProductBiConsumer biConsu= new ProductBiConsumer() {
			
			@Override
			public void printDetails(int id, String name) {
				prod.printProductDetails(id, name);
				
			}
		};
		biConsu.printDetails(777, "PURNA BRAHMA SAHU");
		
//=================================================================================================
		
	}
}
