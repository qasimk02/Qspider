package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Assignment3 {
	@SuppressWarnings("unchecked")
	public static ArrayList createTeam() {
		ArrayList team = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<12;i++) {
			System.out.print("Enter Player "+i+" Name: ");
			team.add(sc.nextLine());
		}
		return team;
	}
	
	//CSK
//	Ruturaj Gaikwad
//	Rachin Ravindra
//	Moeen Ali
//	Shivam Dube
//	Ravindra Jadeja 
//	MS Dhoni
//	Shardul Thakur
//	Deepak Chahar 
//	Tushar Deshpande
//	MustafizurRahman
//	Maheesh Theekshana
	
	//MI
//	Rohit Sharma
//	Ishan Kishan
//	Suryakumar Yadav
//	Tilak Varma
//	Kieron Pollard
//	Dewald Brevis
//	Jasprit Bumrah
//	Riley Meredith
//	Rahul Chahar
//	Basil Thampi
//	Jofra Archer
	
	public static void main(String args[]) {
		System.out.println("Create Mumbai Indians Team");
		ArrayList mi = createTeam();
		System.out.println("Create Chennai Super Kings Team");
		ArrayList csk = createTeam();

		
		if(csk.contains("MS Dhoni")){
			System.out.println("Thala is Pack again");
		}else {
			System.out.println("Oh sad news, Dhoni is not playing anymore");
		}
		
		if(mi.contains("Hardik Pandya")) {
			System.out.println("Management decision is not appropriate");
		}else {
			System.out.println("Wow amazing, Good to hear for MI fans");
		}
		
		if(mi.contains("Hardik Pandya")) {
			mi.remove("Hardik Pandya");
			System.out.println("Rohit is back");
		}
		
		//adding all the players of mi into csk
		csk.addAll(mi);
		
		//printing in forward order
		System.out.println("Forward Order");
		for(int i=0;i<csk.size();i++){
			System.out.print(csk.get(i)+" ");
		}
		
		//printing in reverse order
		System.out.println();
		System.out.println("Reverse Order");
		for(int i=csk.size()-1;i>=0;i--) {
			System.out.print(csk.get(i)+" ");
		}
	}
}