package com.practise.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class freq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String str= sc.nextLine().toLowerCase();
HashMap <Character,Integer> map = new HashMap<>();
for (int i=0;i<str.length();i++) {
	char ch = str.charAt(i);
	map.put(ch, map.getOrDefault(ch, 0)+1);
}
boolean found = false;
System.out.println("Chars with freq 1 are :");
for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	if (entry.getValue()==1) {
		System.out.println(entry.getKey());
		found=true;
	}
	
}
if(!found) {
	System.out.println("all chars are repetitive");
}
	}

}
