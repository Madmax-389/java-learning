package com.practise.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class nonrepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String str2 = sc.nextLine();
String str1=str2.toLowerCase();
boolean found = false;
HashMap<Character,Integer> map= new HashMap<>();
for (int i=0;i<str1.length();i++) {
	char ch = str1.charAt(i);
	map.put(ch, map.getOrDefault(ch, 0)+1);
	}
for(Map.Entry<Character, Integer> entry : map.entrySet()) {
if (entry.getValue()==1) {
	System.out.println(entry.getKey()+" -> "+entry.getValue());
	found =true;
	
}

}
if(!found) {
	System.out.println("All the chars are repetitive");
}}
}