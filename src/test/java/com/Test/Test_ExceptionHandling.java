package com.Test;

public class Test_ExceptionHandling {

	public static void main(String[] args) {
		
		// uncaught Exception
	try {
		int a=10/0;
		System.out.println(a); //
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
//	finally {
//		System.out.println("I am finally");
//	}
	
		System.out.println("Test Exception Handling");
		// caught Exception
		//Thread.sleep(3000);

	}

}
