package com.test;

import com.generic.CrossBrowserTestingWithJava;

public class RunCrossBrowserWithJava {
	
	public static void main(String[] args) {
		CrossBrowserTestingWithJava obj = new CrossBrowserTestingWithJava();
		
		obj.getCrossBrowser("Chrome");
		obj.getCrossBrowser("Firefox");
		obj.getCrossBrowser("msEdge");
	}

}
