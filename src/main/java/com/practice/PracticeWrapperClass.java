package com.practice;

public class PracticeWrapperClass {
	
	public void getWrapper() {
		System.out.println("This is  wrapper class.");
		Integer a = 5;
	}
	
	public static void main(String[] args) {
		PracticeWrapperClass obj = new PracticeWrapperClass();
		obj.getWrapper();
	}

}
