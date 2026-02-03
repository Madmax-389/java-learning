package com.practise.strings;

import java.util.Scanner;

public class quiz {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println("Enter the string");
String str1=sc.nextLine();
StringBuilder sb= new StringBuilder(str1);
StringBuilder reversed = sb.reverse();
	if (sb.equals(reversed)) {
		System.out.println("it is palindrome");
	}
	else {
		System.out.println("it is not a palindrome");
}
	}}
