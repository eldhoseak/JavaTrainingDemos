package com.demo.abstractclass;

public class SavingsAccount extends Account {
	
	private double minbalance;
	public SavingsAccount(String name,double balance,double minBalance) {
		
		// invoke super class constructor.
		super(name, balance);
		this.minbalance=minBalance;
	}

	// need to override the abstract method.
	@Override
	public boolean withdraw(double amount) {
		if(balance>minbalance)
		{
			balance=balance-amount;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	

}