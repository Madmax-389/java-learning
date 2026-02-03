package com.practise.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class removechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String str1=sc.nextLine().toLowerCase();

HashMap<Character,Integer> map = new HashMap<>();
StringBuilder result = new StringBuilder(str1);
for ( int i =0;i<str1.length();i++) {
	char ch = str1.charAt(i);
	map.put(ch, map.getOrDefault(ch, 0)+1);
}

for (int i=0;i<str1.length();i++) {
	char ch = str1.charAt(i);
	if(map.get(ch)==1) {
		result.append(ch);
	}
}

System.out.println("Final string is "+result.toString());
	}

}
