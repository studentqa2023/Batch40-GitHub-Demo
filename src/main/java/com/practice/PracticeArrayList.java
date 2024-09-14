package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeArrayList {
	//ArrayList => List interface
	//Formula to write collection object:
	//Interface<WrapperClass> collectionObject = new ClassName<>();
	public List<Integer> getArrayValue() {
		List<Integer> myList = new ArrayList<>();
		//Insert value in List => add() method => [2, 4, 4, 5, 8, 9]
		myList.add(2);
		myList.add(4);
		myList.add(4);
		myList.add(5);
		myList.add(8);
		myList.add(9);
		myList.add(24);
		
		System.out.println(myList);//[2, 4, 4, 5, 8, 9]
		return myList;
	}
	
	public static void main(String[] args) {
		PracticeArrayList obj = new PracticeArrayList();
		obj.getArrayValue();
	}

}
