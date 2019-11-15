package com.demo.exceptions;

public class Finally {
	static void demothrow1() {
		try {
			System.out.println("In static");
			int j;
			for (int i = 3; i >= 0; i--)
				j = 5 / i;
			throw new ArithmeticException("DEMO");
		}
		finally {
			System.out.println("Finally");
		}
	}
	public static void main() {
			System.out.println("main1");
			demothrow1();
	}

	public static void main(String args[]) {
		System.out.println("main1");
		demothrow1();
	}
}
