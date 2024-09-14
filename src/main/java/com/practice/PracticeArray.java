package com.practice;

import java.util.Arrays;

public class PracticeArray {
	
	int a = 10;
	int[] b = {10, 20, 30, 40};//single dimensional array
	int[] c = {2, 5, 7, 9, 10};//single dimensional array
	int[] e = {103, 204, 414};
	int[][] d = {b,c};//multi dimensional array
	int[][] x = {b, c, e};
	int[][] y = {{1,3,5},{5,7,9},{10,15,24},{123,42, 56}};
	
	public void getCollections() {
		System.out.println(a);//10
		System.out.println(Arrays.toString(b));//{10, 20, 30, 40}
		System.out.println(Arrays.toString(c));//{2, 5, 7, 9, 10}
		
		System.out.println(Arrays.deepToString(d));//{10, 20, 30, 40},{2, 5, 7, 9, 10}
		System.out.println(Arrays.deepToString(x));
		System.out.println(Arrays.deepToString(y));
	}
	
	public static void main(String[] args) {
		PracticeArray pa = new PracticeArray();
		pa.getCollections();
	}

}
