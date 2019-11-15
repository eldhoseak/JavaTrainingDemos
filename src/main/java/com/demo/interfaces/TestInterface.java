package com.demo.interfaces;

interface A{
	public void display();
}
class B implements A{

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Inside class B");
	}

}
class C implements A{

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("inside class C");
	}

}

public class TestInterface {
	public static void main(String args[])
	{
		B ob1=new B();
		ob1.display();

		C ob2=new C();
		ob2.display();

		A a=new B();
		a.display();
		C c= (C)a;
		c.display();
	}

}
