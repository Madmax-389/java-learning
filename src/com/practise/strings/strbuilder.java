package com.practise.strings;

import java.util.Scanner;

public class strbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string u wanna reverse");
String str1=sc.nextLine();
StringBuilder sb = new StringBuilder(str1);
System.out.println("Reversed string is "+sb.reverse());
int count=0;
for (int i=0;i<sb.length();i++) {
if (sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u') {
	count++;
}

	}
System.out.println("Number of vowels are "+count);

}
}