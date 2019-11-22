package com.demo.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {

		Integer intVar1 = new Integer(100);
		int primInt1= intVar1.intValue();
		System.out.println("wrapper int = "+ intVar1);
		System.out.println("Primitive int = "+ primInt1);
		
		Integer intVar2 = 500; // auto boxing
		int primInt2 = intVar2 + 50; // unboxing
		System.out.println("primitive after unboxing = "+primInt2);
		
		// Danger of null pointer exception
		Integer intVar3 = null;
		int primInt3 = intVar3 + 10; // unboxing producesNullpointer exception, due to implicit intValue() call.
		System.out.println(primInt3);
		
		
	}

}
