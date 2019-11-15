package com.demo.collections;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
	public List addEmp(Employee emp)
	{
		List list=new ArrayList();
		
		
		
		Employee e1=new Employee();
		e1.setEmpId(101);
		e1.setName("Madhu");
		e1.setSalary(10000);
		list.add(e1);
		
		
		
		return list;
	}

}
