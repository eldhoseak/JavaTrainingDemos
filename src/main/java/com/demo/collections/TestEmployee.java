package com.demo.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {

	public static void main(String args[])
	{
		Employee[] empArray = {new Employee(1004, "Bob", 7000),new Employee(1001, "David", 7000), 
				new Employee(1000, "Ed", 6000), new Employee(1003, "Jones", 8000),
				new Employee(1002, "Mark", 6500)};
		List list=Arrays.asList(empArray);

		System.out.println("Print elements in their order of insertion.");
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Employee obj=(Employee)it.next();
			System.out.println(obj);
		}


		System.out.println("\n \n Sorted using the default employee sort based on id ");
		Collections.sort(list);
		Iterator it2=list.iterator();
		while(it2.hasNext())
		{
			Employee obj=(Employee)it2.next();
			System.out.println(obj);
		}

		System.out.println("\n \n Sorted using the SortbySalary comparator based on salary");
		Collections.sort(list, new SortbySalary());
		Iterator it3=list.iterator();
		while(it3.hasNext())
		{
			Employee obj=(Employee)it3.next();
			System.out.println(obj);
		}
	}

}
class SortbySalary implements Comparator<Employee> 
{ 
	// Used for sorting in ascending order of 
	// roll number 
	public int compare(Employee a, Employee b) 
	{ 
		if(a.getSalary()==b.getSalary())  
			return 0;  
		else if(a.getSalary()>b.getSalary())  
			return 1;  
		else  
			return -1;  
	} 
} 
