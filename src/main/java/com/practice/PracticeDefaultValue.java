package com.practice;

public class PracticeDefaultValue {
	
	String myName;
	public  void getDefault() {
		System.out.println(myName);
	}
	
	public static void main(String[] args) {
		PracticeDefaultValue obj = new PracticeDefaultValue();
		obj.getDefault();
	}

}
