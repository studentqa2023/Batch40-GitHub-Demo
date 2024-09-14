package com.practice;

import java.io.IOException;

public class PracticeCheckedException {
	
	public void getValue() throws InterruptedException, IOException  {
		
		System.out.println("Hello!");
		
		Thread.sleep(5000);
		
		System.out.println("World!");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		PracticeCheckedException obj = new PracticeCheckedException();
		obj.getValue();
	}

}
