package com.demo.collections;

//Demonstrating HashMap
import java.util.*;

class HashMapDemo {
	public static void main(String[] args) {
		// Create a hash map
		HashMap<String, Double> balance = new HashMap<String, Double>();

		// Put elements to the map
		balance.put("John Doe", new Double(3434.34));
		balance.put("Tom Smith", new Double(123.22));
		balance.put("Jane Baker", new Double(1378.00));
		balance.put("Todd Hall", new Double(99.22));
		balance.put("Ralph Smith", new Double(-19.08));
		System.out.println(balance);

		// Get a set of the entries
		Set set = balance.entrySet();

		// Get an iterator
		Iterator i = set.iterator();

		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();

		// Deposit 1000 into John Doe's account
		double balanceAmount = ((Double) balance.get("John Doe")).doubleValue();
		System.out.println(balanceAmount);
		balance.put("John Doe", new Double(balanceAmount + 1000));
		System.out.println("John Doe's new balance: " + balance.get("John Doe"));
	}
}
