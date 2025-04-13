package com.pbs.acc;
//testing
public class ArithmeticOperationExecutor {
	
	/*
	 * this method taking 3 parameters and using the 1st parameter it calls the functionality implemented in Tester1.java
	 * that method provides result
	 * */
	
	public int execute(ArithmeticOperation ops, int num1, int num2){
		return ops.calculate(num1, num2);
	}
}
