package com.demo.interfaces;

interface A{
	public void displayA();
}

interface B extends A{
	public void displayB();
}

class C implements B{

	public void displayA() {
		// TODO Auto-generated method stub
		System.out.println("implement displayA");
	}
	
	public void displayB() {
		// TODO Auto-generated method stub
		System.out.println("implement displayB");
	}
}

public class TestInterface {
	public static void main(String args[])
	{
		C ob1=new C();
		ob1.displayA();
	}

}
