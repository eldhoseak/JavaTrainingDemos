package com.demo.collections;

import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String args[])
	{
		TestEmployee emp=new TestEmployee();
		Employee e=new Employee();
		List list=emp.addEmp(e);
		
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Employee obj=(Employee)it.next();
			/*System.out.println(obj.getEmpId());
			System.out.println(obj.getName());
			System.out.println(obj.getSalary())*/;
			System.out.println(obj);
		}
		
	}

}
