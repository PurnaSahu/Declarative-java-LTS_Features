package com.pbs.acc;

import java.util.concurrent.atomic.AtomicInteger;

public class InterfaceWithMultipleMethodsImpl2 {

	public static void main(String[] args) {
		/*
		 * Here the scenario is,isSame() method will return the flag value (1/0) based on the output, 
		 * in anonymous class only the returnAutomaticResponse() will send a dynamic response.
		 * */
		
		/*
		 * Because variables used inside anonymous classes or lambdas must be effectively final. 
		 * So instead of a normal int, we use AtomicInteger to hold a mutable value safely.
		 * 
		 * even though 10 threads are incrementing the same counter, AtomicInteger ensures that there are no race conditions, 
		 * and the final result is correct.
		 * 
		 * It works when only single value we want to store but If you're working with larger data types or 
		 * more complex logic, or if you need to handle multiple variables atomically 
		 * (e.g., both an integer and a string), you may consider using AtomicReference or locking mechanisms.
		 * 
		 * AtomicReference same way only but we can store our customClass data having multiple fields/non-primitive type data
		 * */
		AtomicInteger bringResult = new AtomicInteger(0);
		
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
				
				return bringResult.get() == 1 ? "strings are same": "strings are not same";
			}

			@Override
			public Integer isSame(String str1, String str2) {

				int res=-1;
				if (!str1.isEmpty() && !str2.isEmpty()) {
					res = str1.equalsIgnoreCase(str2)? 1 : 0;
					bringResult.set(res);
				}
				
				return res;
			}
		};

	//===============================================================================================
		
		/*
		 * another way of doing the same thing;-> just to show that we can call methods in the same Anonymous class
		 * 
		 * you want to pass data from one method to another inside an anonymous class without using 
		 * instance variables, and instead do it via method calls — totally possible!
		 * 
		 * Works just like any class calling its own methods. Anonymous class calling one method from another
		 * */
		
InterfaceWithMultipleAbstractMethods summarization1 = new InterfaceWithMultipleAbstractMethods() {
			
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
				//here, we calling another abstract method implementation, get the result and based on that take action
				Integer same = isSame("PB", "SAHU");
				
				if(same==1)
					return "strings are same";
				else if(same==0)
					return "strings are not same";
				else
					return "OOPS !! something went wrong...";
				//return same == 1 ? "strings are same": "strings are not same";
			}

			@Override
			public Integer isSame(String str1, String str2) {

				int res=-1;
				if (!str1.isEmpty() && !str2.isEmpty()) {
					res = str1.equalsIgnoreCase(str2)? 1 : 0;
					
				}
				
				return res;
			}
		};
		
	System.out.println(summarization.isSame("pbs", "PBS")+" -> "+summarization.returnAutomaticResponse());
	System.out.println(summarization1.isSame("pbS", "PBS")+" -> "+summarization1.returnAutomaticResponse()
			+" -> "+summarization1.summarizeDate(12, -1));
		
	}

}
