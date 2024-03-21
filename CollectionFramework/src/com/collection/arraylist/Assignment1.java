package com.collection.arraylist;

import java.util.ArrayList;

//add character a-z
public class Assignment1 {
	public static void main(String args[]) {
		ArrayList<Character> listOfCharacter = new ArrayList<>();
		for(char i='a';i<='z';i++) {
			listOfCharacter.add(i);
		}
		System.out.println("Character: "+listOfCharacter);
		System.out.println("Size of List: "+listOfCharacter.size());		
	}
}
