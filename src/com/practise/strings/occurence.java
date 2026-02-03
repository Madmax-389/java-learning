package com.practise.strings;

import java.util.Scanner;

public class occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string ");
String str1=sc.nextLine();
System.out.println("Type the character you wanna check the occurrence of ");
char c = sc.next().charAt(0);
int count=0;
for (int i=0;i<=str1.length()-1;i++) {
	if (c==str1.charAt(i)) {
		count++;
	}
	
}
System.out.println("Occurrence of "+c+ " is "+count);
	}

}
