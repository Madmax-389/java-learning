package com.practise.randomques;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String str1= sc.nextLine();
String reversed= "";
for (int i=str1.length()-1;i>=0;i--) {
	reversed=reversed+str1.charAt(i);
}
System.out.println(reversed);
	}

}
