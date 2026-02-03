package com.practise.randomques;

import java.util.Scanner;

public class vowelcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the sentence");
int count =0;
String str= sc.nextLine();
for (int i =0;i<=str.length()-1;i++) {
	if (str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U') {
		count++;
	}
	
}
System.out.println("Count of vowels is "+count);
	}

}
