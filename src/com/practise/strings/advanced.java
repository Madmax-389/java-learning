package com.practise.strings;

import java.util.Scanner;

public class advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String str1=sc.nextLine();
String str2=str1.replace(' ', '-');
int n = str1.length();
char first=str1.charAt(0);
char last=str1.charAt(n-1);
System.out.println("Length is  "+n);
System.out.println("first letter is   "+first);
System.out.println("Last letter is  "+last);
	}

}
