package com.pbs.acc.nonPrimitive;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	public Long id;
	public String name;
	public String deptName;
	public Double salary;
	
	
	
	public Employee() {
		super();
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptName=" + deptName + ", salary=" + salary + "]\n";
	}



	public Employee(Long id, String name, String deptName, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDeptName() {
		return deptName;
	}



	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}



	public Double getSalary() {
		return salary;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}


	// it works as a Function which takes some non-premitive types and returns some non-premitive type data
	public List<Employee> empFilteredOnSalary(List<Employee> emps){
		List<Employee> empList = new ArrayList<Employee>();
		for(Employee emp : emps) {
			if(emp.getSalary()>100000)
				empList.add(emp);
		}
		return empList;
	}
}
