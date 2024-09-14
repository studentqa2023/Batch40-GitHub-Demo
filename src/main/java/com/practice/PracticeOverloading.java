package com.practice;

public class PracticeOverloading {
	
	public void getSalary() {
		System.out.println("This is the first method.");
	}
	
	public int getSalary(int a) {
		
		return a;
	}
	
	public void getSalary(int a, String b) {
		
	}
	
	public void getSalary(String b, int a) {
		
	}
	
	public void getSalary(double b, int a) {
		
	}
	
	public void getSalary(String y) {
		
	}
	
	public static void main(String[] args) {
		PracticeOverloading obj = new PracticeOverloading();
		obj.getSalary();
	}

}
