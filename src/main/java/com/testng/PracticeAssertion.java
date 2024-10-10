package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeAssertion {
	int x = 100;
	/*
	 * @Test public void getSalary() { if(x==100) {
	 * System.out.println("Number matches!"); }else {
	 * System.out.println("Number does not match!"); } }
	 */
	
	@Test
	public void getMoney() {
		Assert.assertEquals(100, x);
		
		
	}

}
