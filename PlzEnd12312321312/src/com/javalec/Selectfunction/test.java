package com.javalec.Selectfunction;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		ArrayList<Integer>arrayList = new ArrayList<Integer>();
		for(int i = 1900; i <= 2200; i++) {
			arrayList.add(i);
		}
		for(int i = 0; i <= 120; i++) {
			System.out.println(arrayList.get(i));
			
		}
	}

}
