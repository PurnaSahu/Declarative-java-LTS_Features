package com.pbs.acc.ui;

import java.util.stream.Stream;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class ToArraySamples {
	public static void main(String[] args) {
		Stream<Product> products = ProductUtility.getAllProducts().stream();
		
		/*	There are only 2 way, we can call toArray()
		 * 1st way,
		 * 0 parameters passed in toArray()-> returns an Object array of all products
		 * from object array we can fetch data by casting
		 */
		Object[] objs = products.toArray();
		
		for (Object prod : objs) {
			//we will get 1 by 1 Object, which we will cast back to Product
			Product casted= (Product) prod;
			System.out.println(casted); 
			//-> Product has toString(), hence by printing the Product object reference(casted), it will print the data properly
		}
		
		/*
		 * 2nd way;
		 * we pass a IntFunctional Interface -> it means the FI takes primitive int value as input and do the operation, 
		 * after the operation ends, we can return any tpe of data(list, string, any type of Collection object)
		 * 
		 * toArray(size -> new Product[size]) -> how size value will be identified, coz we are not passing that value?
		 * 		Java internally counts number of elements in the stream(size) and pass that value to lambda expression and 
		 * 		toArray() returns an Array of those elements
		 */
		
		Product[] obj = ProductUtility.getAllProducts().stream().toArray(size -> new Product[size]);
		Stream.of(obj).forEach(prod-> System.out.println(prod));
		
		//Product[] obj = products.toArray(Product[]::new);
	}
}

/*
 * Once we call toArray() on stream type data then it will return only Array type data, then we can iterate the Array Datastructure
 * toArray() returns an array, not a List or Set.
   Once a stream is consumed (like after toArray()), it cannot be reused.
 */
