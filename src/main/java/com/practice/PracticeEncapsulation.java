package com.practice;

public class PracticeEncapsulation {
	
	//Binding method & variables in a single unit to protect from outside unauthorized access
	
	private int a;//Instance variable
	private String myname;
	private double  e;
	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getMyname() {
		return myname;
	}

	public void setMyname(String myname) {
		this.myname = myname;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	

}
