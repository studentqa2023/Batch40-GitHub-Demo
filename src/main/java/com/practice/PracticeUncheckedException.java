package com.practice;

public class PracticeUncheckedException {
	
	int a=5;
	public void getNumber() {
		System.out.println(a);//5
		System.out.println(a+4);//9
		
		try {
			System.out.println(a/0);//error
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("bye");//9
	}
	
	public static void main(String[] args) {
		PracticeUncheckedException obj = new PracticeUncheckedException();
		obj.getNumber();
	}

}
