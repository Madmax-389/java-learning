package com.practise.strings;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string you wanna reverse");
String str1=sc.nextLine();
String reversed="";

for (int i=str1.length()-1;i>=0;i--) {
	reversed = reversed + str1.charAt(i);
	
	
}
System.out.println("Reversed string is "+reversed);
	}

}
