package com.collection.arraylist;

import java.util.ArrayList;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Assignment2 {
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		for(char ch='Z';ch>='A';ch--) {
			list.add(ch);
		}
		
//		printing
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
		
	}
}
