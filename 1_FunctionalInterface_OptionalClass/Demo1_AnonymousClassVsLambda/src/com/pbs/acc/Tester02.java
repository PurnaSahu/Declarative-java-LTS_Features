package com.pbs.acc;

public class Tester02 {

	public static void main(String[] args) {
		ArithmeticOperationExecutor executor = new ArithmeticOperationExecutor();
		
		//Lambda without type inference
		ArithmeticOperation addition = (int num1, int num2)-> {
				return num1 + num2;
		};
		
		
		//Lambda with type inference
		ArithmeticOperation addition1 = (num1, num2)-> {
				return num1 + num2;
		};
		
		//Lambda with return type inference
		ArithmeticOperation addition2 = (num1, num2)-> num1 + num2;
		
		int result = executor.execute(addition, 10, 20);
		System.out.println(result);
		
		/*
		 * here, we can directly pass the lambda expression as parameter in the method, 
		 * that lambda expression internally prepare an Anonymous class only, which will take 2 parameters as input
		 * to calculate() and return an abject reference of that anonyymous class.
		 * Automatically the JRE will findout the calculate() here, coz its FI only 1 abstract method there
		 * 
		 * execute() -> act like a Higher order function means it takes a first order function(all lamda expressions are FOF)
		 * */
		//Inline Lambda
		int result1 = executor.execute((num1, num2)-> num1 + num2, 10, 20);
		System.out.println(result1);
		
	}
	

}
