package com.practice;

public class PracticeVariables {
	//Instance variables (some call it "global variables", but it's not technically right
	int a = 5;
	int b = 3;
	double c = 5.45;
	boolean  d = true;
	String e = "Smart Tech";
	static int f = 45;//static variable
	
	public void getStudent() {
		System.out.println(a+b);//8
	}
	
	public void getTeacher() {//non-static method
		System.out.println(c);
		System.out.println(f);
		
	}
	
	public static void getSchool() {//static method
		System.out.println(f);
	}
	
	public void getLocal() {
		int g = 125;//Local variable
	}
	
	public static void main(String[] args) {
		PracticeVariables obj = new PracticeVariables();
		obj.getStudent();
		obj.getTeacher();
		getSchool();
	}

}
