package com.pbs.acc;

public class InterfaceWithMultipleMethodsImpl {

	public static void main(String[] args) {
		/*
		 * here we tried to create a Anonymous class to provide the implementation to abstract methods, 
		 * hence it will force us to provide implementations 
		 * of all abstract methods in the interface
		 * */
		InterfaceWithMultipleAbstractMethods summarization = new InterfaceWithMultipleAbstractMethods() {
			
			@Override
			public String summarizeDate(int num1, int num2) {
				String summarizedInfo=null;
				if (num1> num2)
					summarizedInfo=num1+" is greater then "+ num2;
				else if(num1 == num2)
					summarizedInfo="both values are same";
				else
					summarizedInfo=num2+" is greater then "+ num1;
				return summarizedInfo;
			}

			@Override
			public String returnAutomaticResponse() {
				
				return "hello";
			}

			@Override
			public Integer isSame(String str1, String str2) {

				Integer res=null;
				if (str1.isEmpty() && str2.isEmpty()) {
					res = str1.equalsIgnoreCase(str2)? 1 : 0;
				}
				
				return res;
			}
		};

		/*
		 * here, we can not write lmbda expression, becoz the interface is not FI.
		 * */
		//InterfaceWithMultipleAbstractMethods lambda= (num1, num2)
	}

}
