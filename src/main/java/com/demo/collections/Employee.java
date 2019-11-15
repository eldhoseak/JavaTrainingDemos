package com.demo.collections;

public class Employee implements Comparable{
	
	// Add some properties.
	private int empId;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Object obj) {
	
		if(this.getEmpId()==((Employee)obj).getEmpId())  
			return 0;  
			else if(this.getEmpId()>((Employee)obj).getEmpId())  
			return 1;  
			else  
			return -1;  
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

}
