package com.practise.hashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
public class removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String str= sc.nextLine().toLowerCase();
HashSet <Character> set = new HashSet<>();
StringBuilder sb = new StringBuilder();
for (int i=0;i<str.length();i++) {
	char ch =str.charAt(i);
	if (!set.contains(ch)) {
		set.add(ch);
		sb.append(ch);
	}
}
System.out.println(sb.toString());
	}
}
