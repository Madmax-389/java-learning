package com.practise.randomques;

import java.util.Scanner;

public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the sentence");
String str1 = sc.nextLine();
String str2="";
for (int i=str1.length();i>=0;i--) {
	str2=str1.charAt(i)+"";
}
System.out.println(str2);
	}

}
