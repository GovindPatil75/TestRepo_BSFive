package com.Test;

public class Test_throw {

	public static void main(String[] args) {
		
		System.out.println("Test 1");
		try {
		    throw new Exception("BatchFive Exception");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Test 2");

	}

}
