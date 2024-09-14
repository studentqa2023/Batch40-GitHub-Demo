package com.practice;

public class PracticeObject {
	
	//when the method is not static, we need to create object
	public void getMoney() {//non-static method
		//code
		System.out.println("This is an example of creating an object.");
	}
	
	public static void main(String[] args) {
		//run the getMoney() from here
		//non-static method => create an object
		//Formula to create an object
		//ClassName obj = new ClassName();
		PracticeObject obj = new PracticeObject();
		obj.getMoney();
		
	}

}
