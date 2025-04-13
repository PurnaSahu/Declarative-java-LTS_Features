package com.pbs.acc;

/*
 * here we dont even need to implement the interface , coz when we implement it force to provide implementation for abstract methods
 * as we are using lamda expressions to provide implementation to abstract method, hence no need to implement at class level
 * 
 * here, we dont need to create separate class to provide separate implementation to the same abstract method of interface
 * */
public class ArithmaticOperationImpl {

	public static void main(String[] args) {
		
		ArithmeticOperation addition = (int num1, int num2)-> {
												return num1 + num2;
											};

		ArithmeticOperation substraction= (num1, num2) -> {
			if (num1> num2)
				return num1 - num2;
			else if(num2>num1)
				return num2-num1;
			else
				return 0;
		};
		
		ArithmeticOperation multiplication=(num1, num2) -> {
			if (num1>=1 && num2>=1)
				return num1 * num2;
			else if (num1==0 || num2==0)
				return 0;
			else
				return -1;
		};
		
		System.out.println("Addition is: "+addition.calculate(53, 7)+" and substraction is: "+substraction.calculate(9, 9)+
				" and Multiplication is: "+multiplication.calculate(12, 0));
	}
}