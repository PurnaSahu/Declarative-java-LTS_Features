package com.pbs.acc.ui;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("provide the number to find Factorial: ");
		int num = sc.nextInt();
		sc.close();
		
		int res = IntStream.rangeClosed(2, num).reduce(1, (num1, num2) -> num1*num2);
		System.out.println(res);
	}

}
