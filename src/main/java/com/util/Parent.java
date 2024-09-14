package com.util;

public class Parent extends GrandParent {
	
	@Override
	public void getAsset() {
		System.out.println("New class.");
	}
	
	public static void main(String[] args) {
		Parent obj = new  Parent();
		obj.getAsset();
	}
}
