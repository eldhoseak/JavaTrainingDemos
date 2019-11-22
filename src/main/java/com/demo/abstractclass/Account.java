package com.demo.abstractclass;

public abstract class Account {
	
	private String name;
	protected double balance;
	
	// Constructor
	Account(String name,double balance)
	{
		this.name=name;
		this.balance=balance;
	}
	public String showDetails() {
		return  "\nName: " + name + 
				"\nBalance: " + balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}
	
	// can have non abstract or concrete method.
	public boolean deposite(double amount)
	{
		if(amount>0) {
		balance=balance+amount;
		return true;
		}
		else {
			return false;
		}
	}
	
	// abstract method without implementation.
	public abstract boolean withdraw(double amount);

}