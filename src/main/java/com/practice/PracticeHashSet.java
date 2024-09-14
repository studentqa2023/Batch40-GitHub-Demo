package com.practice;

import java.util.HashSet;
import java.util.Set;

public class PracticeHashSet {
	
		//HashSet => Set interface
		//Formula to write collection object:
		//Interface<WrapperClass> collectionObject = new ClassName<>();
		public Set<Integer> getSetValue() {
			Set<Integer> myset = new HashSet<>();
			//Insert value in List => add() method => [2, 4, 4, 5, 8, 9]
			myset.add(2);
			myset.add(4);
			myset.add(4);
			myset.add(5);
			myset.add(8);
			myset.add(9);
			
			System.out.println(myset);
			return myset;
		}
		public static void main(String[] args) {
			PracticeHashSet obj = new PracticeHashSet();
			obj.getSetValue();
		}

}
