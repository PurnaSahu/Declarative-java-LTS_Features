package com.pbs.acc.nonPrimitive;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		List<Employee> emps= Arrays.asList(
											new Employee(1234L, "purna", "IT", 120000.00),
											new Employee(2345L, "brahma", "IT", 130000.00),
											new Employee(1321L, "sahu", "IT", 300000.00),
											new Employee(4321L, "abc", "IT", 80000.00),
											new Employee(3312L, "xyz", "IT", 65000.00)
											);
		
		//lambda expression
		/*
		 * Here, 1 thing to observe in lambda expression, on left side of lambda expression we hold what is shared as parameter
		 * emplo-> this holds List<Employee>(if u keep cursor there), coz func1.returnEmpLists(emps), here we passing
		 * employee list reference (emp) 
		 * */
		EmployeeFunction func1 = emplo -> emp.empFilteredOnSalary(emplo);
		System.out.println(func1.returnEmpLists(emps));
		
		//Anonymous class implementation
		EmployeeFunction func = new EmployeeFunction() {
			
			@Override
			public List<Employee> returnEmpLists(List<Employee> empls) {
				List<Employee> empFilteredOnSalary = emp.empFilteredOnSalary(emps);
				return empFilteredOnSalary;
			}
		};
		List<Employee> returnEmpLists = func.returnEmpLists(emps);
		System.out.println(returnEmpLists);
	}

}
