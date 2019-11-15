package com.demo.exceptions;

class TestExpn{
	public void display(int a,int b)
	{
		try {
		int c=a/b;
		System.out.println("Value of C is : " + c);
		}
		finally{
			System.out.println("cannot finally ");
		}


	}
}
public class TestException {
	public static void main(String args[]) {
	TestExpn ob=new TestExpn();
	ob.display(4,0);
	}


}
