package labb2.java;

import java.util.Scanner;

public class Stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input= sc.nextLine();
		
		if(input.length()>0) {
			System.out.println("Character at index 0:" +input.charAt(0));
		}else {
			System.out.println("String is empty cannot use at charAt(). ");
		}
		
		System.out.println(" length of String :" + input.length());
		
		System.out.println("Uppercase of String :" +input.toUpperCase());
		
		System.out.println("Lowercase of String :" +input.toLowerCase());
		
		if(input.length()>=3) {
			System.out.println("The subString (0,3)"+input.substring(0,3));
		}else {
			System.out.println("Too Short for substing(0,3)");
		}
		
		System.out.println("input contains 'a': "+input.contains("a"));
		
		System.out.println("replace 'a' with '@' "+input.replace('a', '@'));
		

	}

}
