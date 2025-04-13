package com.pbs.acc;

public class Tester03 {

	public static void main(String[] args) {
		
		ArithmeticOperationExecutor executor = new ArithmeticOperationExecutor();
		
		ArithmeticOperation addition1 = new ArithmeticOperation() {			
			@Override
			public Integer calculate(int num1, int num2) {
				System.out.println("Value "+this);
				return num1 + num2;
			}
		};
		
		/* just to show that we dont even need the Executor class to call the implementation methods of the interface
		 * we can directly access the Interface method with lambda expression
		 * */
		ArithmeticOperation addition2 = (int num1, int num2)-> {
			//System.out.println("Value "+this);
			return num1 + num2;
		};
		
	}
	

}
