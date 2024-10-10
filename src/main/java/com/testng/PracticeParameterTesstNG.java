package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeParameterTesstNG {
	
	@Test
	@Parameters({"myName", "country"})
	public void getName(String myName, String country) {
		System.out.println(myName);
		System.out.println(country);
	}

}
