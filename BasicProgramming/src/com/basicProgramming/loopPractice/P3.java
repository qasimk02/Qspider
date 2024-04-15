package com.basicProgramming.loopPractice;

//WAC to print even number from the range 1 to 10 in reverse order
public class P3 {
	public static void main(String args[]) {
		int i=10;
		for(i=10;i>0;i--) {
			if((i&1)==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		i=10;
		do {
			if((i&1)==0) {
				System.out.print(i+" ");
			}
			i--;
		}while(i>0);
	}
}
