package com.shoplify.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandler {
	
	BufferedReader br;
	
	public InputHandler() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	//taking input as byte
	public byte nextByte(){
		byte n;
        try {
            n = Byte.parseByte(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("Invalid Input! Enter a valid Byte Number");
            n = nextByte();
        }
        return n;
	}
	
	//taking input as short
	public short nextShort(){
		short n;
        try {
            n = Short.parseShort(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("Invalid Input! Enter a valid Short Number");
            n = nextShort();
        }
        return n;
	}
	
	//taking input as integer
	public int nextInt(){
		int n;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("Invalid Input! Enter a valid Integer Number");
            n = nextInt();
        }
        return n;
	}
	
	//taking input as long
	public long nextLong(){
		long n;
        try {
            n = Long.parseLong(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("Invalid Input! Enter a valid Long Number");
            n = nextLong();
        }
        return n;
	}
	
	//taking input as float
	public float nextFloat() {
		float n;
        try {
            n = Float.parseFloat(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("Invalid Input! Enter a valid Float Number");
            n = nextFloat();
        }
        return n;
	}
	
	//taking input as double
	public double nextDouble() {
		double n;
        try {
        	String str = br.readLine();
        	System.out.println(str);
            n = Double.parseDouble(str);
        } catch (NumberFormatException | IOException e) {
            System.err.println("Invalid Input! Enter a valid Double Number");
            n = nextDouble();
        }
        return n;
	}
	
	//taking input as character
	public char nextChar() {
		char ch;
		try {
			ch =  (char) br.read();
		} catch (IOException e) {
			System.err.println("Error while reading the input! Try again");
			ch = nextChar();
		}
		return ch;
	}
	
	//taking input as string
	public String nextLine() { 
		String str;
		try {
			str = br.readLine();
		} catch (IOException e) {
			System.err.println("Error while reading the input! Try again");
			str = nextLine();
		}
		return str;
	}
	
}
