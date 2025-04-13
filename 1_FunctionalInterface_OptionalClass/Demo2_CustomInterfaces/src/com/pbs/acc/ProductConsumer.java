package com.pbs.acc;
/**
 * @author purna.sahu
 * @apiNote Custome Consumer FI
 * 
 * I have meade my own custom FI, which will act as a Consumer. it will consume some type of data(1 parameter), 
 * it could be either primitive or Object references...
 * 
 * but it won't return anything
 */
public interface ProductConsumer {
	void printNameInUpper(String name);
}
