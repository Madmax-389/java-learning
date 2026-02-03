package com.practise.interview;

import java.util.Scanner;

public class nonrepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string ");
String str1 = sc.nextLine();
for (int i=0;i<str1.length();i++) {
	char ch = str1.charAt(i);
	int count =0;
	for(int j=0;j<str1.length();j++) {
		if (ch==str1.charAt(j)) {
			count++;
		}
		
		}
	if (count==1) {
		System.out.println("First non repeating char is "+ch);
		break;
	}
}
	}

}
