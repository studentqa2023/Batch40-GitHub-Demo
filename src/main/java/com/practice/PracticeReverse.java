package com.practice;

public class PracticeReverse {
	
	//how to reverse a  String
	//Negative For loop
	public void getReverseWithLoop(String country) {
		for(int i=(country.length()-1);i>=0;i--){
			System.out.print(country.charAt(i));
		}
	}
	
	//Using reverse method from StringBuilder class
	public void getReverseWithStringBuilder(String country) {
		StringBuilder sb = new StringBuilder(country);
		System.out.println(sb.reverse());
	}
	
	public static void main(String[] args) {
		PracticeReverse obj = new PracticeReverse();
		obj.getReverseWithLoop("Bangladesh");
		//obj.getReverseWithStringBuilder("Smart Tech");
	}

}
