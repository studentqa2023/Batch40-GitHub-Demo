package com.practice;

public class PracticeMethod {
	
	//Non-static void method (non-return method)
	public void getVoidMethod() {
		System.out.println("This is a non-static void method.");
	}
	
	//Static void method
	public static void getStaticVoid() {
		System.out.println("This is a static void method.");
	}
	
	//Return (Non-void) & non-static method
	public int getReturn() {
		System.out.println("This is a non-static return method.");
		return 5;
	}
	
	//Static return method
	public static String getStaticReturn() {
		System.out.println("This is a static return method.");
		return "Smart Tech";
	}
	
	//main method
	public static void main(String[] args) {
		//Instantiation => create an object
		PracticeMethod obj = new PracticeMethod();
		obj.getVoidMethod();
		
		//getStaticVoid();
		PracticeMethod.getStaticVoid();
		
		obj.getReturn();
		
		getStaticReturn();
	}

}
