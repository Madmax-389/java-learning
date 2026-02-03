package com.practise.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter first string");
String str1=sc.nextLine().toLowerCase();
System.out.println("Enter the second string");
String str2=sc.nextLine().toLowerCase();
if (str1.length() !=str2.length()) {
	System.out.println("Can not be anagrams as lengths are different");
}else {
HashMap<Character,Integer> map1=new HashMap<>();
HashMap<Character,Integer> map2=new HashMap<>();
for (int i=0;i<str1.length();i++) {
	char ch = str1.charAt(i);
	map1.put(ch, map1.getOrDefault(ch, 0)+1);
}

for (int i=0;i<str2.length();i++) {
	char ch = str2.charAt(i);
	map2.put(ch, map2.getOrDefault(ch, 0)+1);
}

if (map1.equals(map2)) {
	System.out.println("It is an anagram");
}
else {
	System.out.println("It is not an anagram");
}


	}
	}
}
