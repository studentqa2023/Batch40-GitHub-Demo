package com.practice;

public class PraticeParameter {
	int a = 5;
	int b = 3;
	public void getSalary() {//no parameter
		System.out.println(a+b);//8
	}
	
	public void getIncome(int c, int d) {//parameter
		System.out.println(c+d);
	}
	
	public  void  getValue(String myCountry, boolean y) {
		System.out.println(myCountry);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		PraticeParameter obj = new PraticeParameter();
		obj.getSalary();//8
		obj.getIncome(45, 10);//55
		obj.getIncome(80, 20);//100
		obj.getValue("USA", false);
		obj.getValue("Bangladesh", true);
	}

}
