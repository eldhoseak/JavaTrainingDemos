package com.demo.exceptions;

class ExceptionDemo1  {
	// If the class file is not found then handle the error
	// by displaying error message and returning 0

	public int error(){
		int status = 0;
		try{
			Object o = Class.forName("java.lang.String1").newInstance();
			status = 1;
		}catch (ClassNotFoundException e){
			System.out.println("Please check the config files" + e);
		}
		catch (IllegalAccessException e){
			System.out.println("Please check the config files" + e);
		}
		catch (InstantiationException e){
			System.out.println("Please check the config files"+ e);
		}

		return status;
	}

	public static void main(String args[]){

		ExceptionDemo1 e = new ExceptionDemo1();
		// we are not handling the error here
		System.out.println(" before method call");
		System.out.println(" after method call  " + e.error());
	}
}

