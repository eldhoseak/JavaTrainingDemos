package com.demo.abstractclass;

public class UseAccount {
	
	public static void main(String args[])
	{
		//Use Account reference
		Account sa=new SavingsAccount("Ed",10000,1500);
		
		System.out.println("Initial Information is : " + sa.showDetails());
		System.out.println("Trying to deposit Rs. 1000: " + sa.deposite(1000));
		System.out.println("Balance: " + sa.getBalance());
	
		System.out.println("Trying to withdraw Rs. 3000: " + sa.withdraw(3000));// invoke abstract method. 
		System.out.println("Balance: " + sa.getBalance());
	}

}