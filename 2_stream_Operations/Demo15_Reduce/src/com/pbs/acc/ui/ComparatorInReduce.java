package com.pbs.acc.ui;

import java.util.Comparator;
import java.util.stream.Stream;

import com.pbs.acc.bean.Product;
import com.pbs.acc.bean.ProductUtility;

public class ComparatorInReduce {

	public static void main(String[] args) {
		
	//***************************************************Primitive data*******************************************************
		
		Integer max1 = Stream.of(11,21,33,22,44,55,66,21).reduce((data1, data2) -> data1>data2? data1:data2).get();
		
		//As it's Wrapper class (Integer), hence we can directly use static method compare()
		Integer max2 = Stream.of(11,21,33,22,44,55,66,21).reduce(0, (data1, data2) -> Integer.compare(data1, data2));
		/*
		 * The above logic won't work & will return -1 as output, but why?
		 * 		This is the problem with compare() -> if we using inside reduce() then we must need to handle all possible 
		 * 		scenarios as well
		 * 		What does Integer.compare(data1, data2) return?
					-1 if data1 < data2
					0 if data1 == data2
					1 if data1 > data2
					
				Integer.compare(0, 11) → -1
				Integer.compare(-1, 21) → -1 and so on....
				..
				Integer.compare(-1, 21) → -1 is the final output
		 */
		
		Integer max3 = Stream.of(11,11,21,33,22,44,55,66,21).reduce(1, (data1, data2) -> Integer.compare(data1, data2) > 0 ? data1:data2);
		/*
		 * Integer.compare(1, 11) → -1 which is <0 so, send 11 for next iteration
		 * Integer.compare(11, 11) → 0 > 0 -> false so, send data2
		 * Integer.compare(11, 21) → -1 -> send 21 for next comparision
		 */
		
		System.out.println(max3);
		
	//***************************************************Non-Primitive data*******************************************************

		/*
		 * usually for finding max, we should use max() or reduce()-> without Comparator we can use, the below options available 
		 * but bit complex
		 * 
		 * reduce((p1, p2) -> ...) compares two elements at a time: It compares two elements at a time and carries forward the "winner"
		 * EX:
		 * 		Double.compare(12345.0, 12000.0) → returns 1 so, pass the product1 for next iteration
				Double.compare(12345.0, 1000.0) → returns 1 so, again pass the product1 for next iteration
				Double.compare(12345.0, 56000.0) → returns -1 so, pass the product2 for next Iteration and from there we fetching the price again
				Double.compare(56000.0, 67000.0) → returns 1 so, final we got product2 as single result
				
				Now no more elements. So the final result is Product2, which had the highest price.
		 */
		Product maxProduct = ProductUtility.getAllProducts().stream().reduce((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()) > 0 ? p1:p2).get();
		System.out.println(maxProduct);
	}

}
