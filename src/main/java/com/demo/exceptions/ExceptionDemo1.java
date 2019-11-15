package com.demo.exceptions;

class ExceptionDemo1  {
	// If the class file is not found then handle the error
	// by displaying error message and returning 0

	public int calculate(int a, int b) throws MyException{
		int status = 0;
		try {
			int c=a/b;
			System.out.println("Value of C is : " + c);
			}
		catch(ArithmeticException e) {
			throw new MyException(e.getMessage());
		}finally {		
			System.out.println("inside finally");
		}
       System.out.println("after exception throws.");
		return status;
	}

	public static void main(String args[]){

		ExceptionDemo1 e = new ExceptionDemo1();
		// we are not handling the error here
		System.out.println(" before method call");
		try {
			System.out.println(" after method call  " + e.calculate(5,0));
		} catch (MyException e1) {
			System.out.println("inside MyException handler "+ e1.getMessage());
		}
	}
}

class MyException extends Exception{
	public MyException(String s) 
    { 
        // Call constructor of parent Exception 
        super(s); 
    } 
}
