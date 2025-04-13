package com.pbs.acc;

public class Tester01 {
	public static void main(String[] args) {
		int num = 45;
		/*here we provided the implementation for that abstract method via anonymous class
		 * 
		 * here 1 intresting thing is, if we take any variable from outer block and use it inside anonymous class then 
		 * that value automatically will be made as final/constant by compiler, i can not change the value of that variable
		 * */
		//num = 12;
				
		ArithmeticOperationExecutor executor = new ArithmeticOperationExecutor();
		
		ArithmeticOperation addition = new ArithmeticOperation() {
			
			@Override
			public Integer calculate(int num1, int num2) {
				return num1 + num2 + num;
			}
		};
		/*
		 * in above we just provided the implementation to the abstract method, but in below we calling the method to do 
		 * some operation
		 * 
		 * in anonymous class, we can provide override multiple abstract methods and provide implementation for multiple methods
		 * 
		 * we are assigning the reference of an anonymous class object (that implements ArithmeticOperation) to the variable addition.
			addition is not an Integer — it's an object reference to the anonymous class implementing ArithmeticOperation.
			It does not hold the return value of the calculate() method directly.

			To get the actual result (an Integer), you'd call the method:
			int result = addition.calculate(2, 3);
		 */
		int res1=addition.calculate(4, 3);// we can directly call like this as well
		
		/*
		 * here, we just showed an example where, we can also pass the object reference to another method and 
		 * from there we can call the method implementation of that Interface aswell
		 * 
		 * here, we tried to show another thing that is, the addition reference which we passed, 
		 * we can directly pass the lambda expression also to another method as parameter, please check the example Tester02.java
		 * */
		int result = executor.execute(addition, 10, 20);
		System.out.println(result);
	}
}
