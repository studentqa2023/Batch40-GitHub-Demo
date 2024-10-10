package com.testng;

import org.testng.annotations.Test;

public class PracticeTestNG {
	
	@Test(priority=0, groups= {"smoke", "regression"})
	public void getLogin() {
		System.out.println("This is Login method.");
	}
	
	@Test(priority=1, groups= {"functional"})
	public void getSearch() {
		System.out.println("This is Search method.");
	}
	
	@Test(priority=2, groups= {"smoke"})
	public void getCart() {
		System.out.println("This is Cart method.");
	}
	
	@Test(priority=3, dependsOnMethods= {"getCart"}, groups= {"regression"})
	public void getPayment() {
		System.out.println("This is Payment method.");
	}

}
