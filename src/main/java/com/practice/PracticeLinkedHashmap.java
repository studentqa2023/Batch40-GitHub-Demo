package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeLinkedHashmap {
	
	//LinkedHashmap => Map interface
	//Formula to write collection object:
	//Interface<WrapperClass> collectionObject = new ClassName<>();
	public  Map<String, String> getMapValue() {
		Map<String, String> mymap = new LinkedHashMap<>();
		//Add Name & City
		//To add => put() method
		mymap.put("Name", "Michael");
		mymap.put("City", "Boston");
		mymap.put("Country", "USA");
		
		System.out.println(mymap);
		return mymap;
	}

	public  Map<String, Integer> getSalary() {
		Map<String, Integer> mycat = new LinkedHashMap<>();
		//Add Name & City
		//To add => put() method
		mycat.put("Age", 5);
		mycat.put("Zip", 999);
		
		
		System.out.println(mycat);
		return mycat;
	}
	
	public static void main(String[] args) {
		PracticeLinkedHashmap obj = new PracticeLinkedHashmap();
		obj.getMapValue();
		obj.getSalary();
	}

}
