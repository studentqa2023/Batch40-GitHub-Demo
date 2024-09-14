package com.practice;

public class PracticeForLoop {
	
	public void getPositiveLoop() {
		
		//positive for loop
		//Formula =>  for(start;end;++) | position = 0,1,2,3,...
		//Print from 0 to 100
		for(int i=0;i<=100;i++) {
			System.out.println(i);
		}
		
	}
	
	public void getNegativeLoop() {
		//negative for loop
		//Formula =>  for(start;end;--) | position = 3,2,1,0
		//Print from 100 to 0
		for(int j=100;j>=0;j--) {
			System.out.println(j);
		}
		
	}
	
	public void getInfiniteLoop() {
		for(int a=0;;a++) {
			System.out.println(a);
			if(a==50) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		PracticeForLoop obj = new PracticeForLoop();
		//obj.getPositiveLoop();
		//obj.getNegativeLoop();
		obj.getInfiniteLoop();
	}

}
