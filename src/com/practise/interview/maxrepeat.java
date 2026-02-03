package com.practise.interview;

import java.util.Scanner;

public class maxrepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String str1= sc.nextLine();
int max =0;
char result='\0';



for (int i=0;i<str1.length();i++) {
	char ch = str1.charAt(i);
	int count=0;
	for (int j=0;j<str1.length();j++) {
		if (ch==str1.charAt(j)) {
			count++;
		}
		
	}
	if (count>max) {
		max =count;
		result = ch;
	}
	
	}
if (max>1) {
	System.out.println("Maximum repetitive char is "+result);
}
else {
	System.out.println("No repetitive char found");
}
}
	}

