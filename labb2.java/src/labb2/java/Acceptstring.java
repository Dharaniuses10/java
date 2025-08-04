package labb2.java;

import java.util.Scanner;

public class Acceptstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Frist String");
		String Str1=sc.nextLine();
		System.out.println("Enter Second String");
		String Str2=sc.nextLine();
		if(Str1.equals(Str2)) {
			System.out.println("Equals(): both String have same content");
		}else {
			System.out.println("equals(): both String have diffrent content");
		}
		
		if(Str1==Str2) {
			System.out.println("both strings have same memory loaction");
		}else {
			System.out.println("both strings have different memory location");
		}
		
	}

}
