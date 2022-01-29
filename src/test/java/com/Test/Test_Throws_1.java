package com.Test;

public class Test_Throws_1 {

	public static void main(String[] args) throws ArithmeticException{
		Test_Throws_1 t=new Test_Throws_1();
		try {
		   t.div();
		}catch(Exception e) {
			
		}
		System.out.println("Test throws");

	}
	public void div() throws ArithmeticException{
		int i=10/0; 
	}

}
