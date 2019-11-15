package com.demo.interfaces;

interface Shape{
	public int aa=1;

}

class Rectangle implements Shape{

	public double area(int a, int b) {

		return a*b;
	}

}
class Traingle implements Shape{


	public double area(int a, int b) {

		// TODO Auto-generated method stub
		return (a*b)/2;
	}

}
public class TestInterfaceDemo implements Shape{
	public static void main(String args[])
	{

		System.out.println("Area of Rectangle is : " +aa);


	}

}
