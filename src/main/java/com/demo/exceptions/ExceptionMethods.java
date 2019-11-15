package com.demo.exceptions;

public class ExceptionMethods
{
	public static void main(String[] args) {

		try {
		int [] numberArray = {1,2, 3};
		System.out.println(numberArray[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught the exception.");
			e.printStackTrace();
		}
	
	}
}
