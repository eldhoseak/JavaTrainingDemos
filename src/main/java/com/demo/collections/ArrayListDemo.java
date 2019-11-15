package com.demo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String args[])
	{
		List list=new ArrayList();
		list.add(0,"a");
		list.add(1,"b");
		list.add(2,"c");
		list.add(3,"d");
		list.add(4,new Integer(5));
		//list.remove(1);
		System.out.println(list);
		System.out.println(list.get(4));
		System.out.println(list.indexOf("c"));
		
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
