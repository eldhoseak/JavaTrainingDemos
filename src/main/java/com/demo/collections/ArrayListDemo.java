package com.demo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String args[])
	{
		// Add elements in array.
		List list=new ArrayList();
		list.add("one");
		list.add("B");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0F));
		list.add("second"); // duplicate, is added
		list.add(new Integer(4)); // duplicate, is added
		
		System.out.println(list);
		
		System.out.println("size "+ list.size());
		System.out.println("list.get(2) " + list.get(2));
		System.out.println("index of B "+list.indexOf("B"));
	
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println("sub list "+ list.subList(1, 3));
		
		List tempList=new ArrayList();
		tempList.add("ed");
		tempList.add("A");
		tempList.add("2019");
		
		list.addAll(tempList);
		System.out.println("list after appending a list "+ list);
		
		list.removeAll(tempList);
		System.out.println("list after removing sub list "+ list);
		
		// Now try to sort the list.
		//Collections.sort(list);
	}

}
