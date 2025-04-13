package com.pbs.acc.nonPrimitive;

import java.util.List;

@FunctionalInterface
public interface EmployeeFunction {

	public List<Employee> returnEmpLists(List<Employee> empls);
}
