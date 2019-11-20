package com.demo.interfaces;

interface Shape{
	public int aa=10;
	 double area(int a, int b);
	
	default double areaDefault(int a, int b){
		return 10;
	}
	
}

class Rectangle implements Shape{

	public double area(int a, int b) {

		return a*b;
	}
	
	public double areaDefault(int a, int b){
		return 50;
	}

}
class Traingle implements Shape{


	public double area(int a, int b) {

		// TODO Auto-generated method stub
		return (a*b)/2;
	}

}
public class TestInterfaceDemo{
	public static void main(String args[])
	{
		
		Shape shape = new Rectangle();

		System.out.println("Area of Rectangle is : " +shape.area(3, 4));
		
		System.out.println("Area default of Rectangle is : " +shape.areaDefault(3, 4));
		

		 shape = new Traingle();

		System.out.println("Area of Traingle is : " +shape.area(5,10));
		System.out.println("Area default of Traingle is : " +shape.areaDefault(5,10));


	}

}
