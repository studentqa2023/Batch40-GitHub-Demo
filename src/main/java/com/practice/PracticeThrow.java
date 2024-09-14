package com.practice;

public class PracticeThrow {
	
	public void getThrow() throws Exception {
		
		System.out.println("Hi!");
		Thread.sleep(5000);
		System.out.println("Good morning!");
		throw new Exception("This is new exception!");
	}
	
	public static void main(String[] args) throws Exception {
		PracticeThrow obj = new PracticeThrow();
		obj.getThrow();
	}

}
