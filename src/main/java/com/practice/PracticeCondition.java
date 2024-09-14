package com.practice;

public class PracticeCondition {
	
	public void getCondition(String name) {
		
		if(name.contains("Rez")) {
			System.out.println("Found my name.");
		} else {
			System.out.println("Not found!");
		}
	}
	
	public void getWage(String country) {
		if (country.contains("Can")) {
			System.out.println("This is Canada");
		}  else if (country.contains("USA")) {
			System.out.println("This is USA");
		} else {
			System.out.println("No country found!");
		}
	}
	
	public static void main(String[] args) {
		PracticeCondition obj = new PracticeCondition();
		obj.getCondition("Rezwan");
		obj.getCondition("Smart Tech");
		obj.getCondition("Re1z");
		
		obj.getWage("Bangladesh");
	}

}
