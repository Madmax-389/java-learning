package com.practise.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class namestartvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
HashMap <Integer,String> map = new HashMap<>();
map.put(1, "Mohit");
map.put(2, "abhishek");
map.put(3, "Ayush");
map.put(4, "Navpreet");
map.put(5, "Mohit");
map.put(6, "sam");

int count =0;
for(Map.Entry<Integer, String> entry: map.entrySet()) {
	char ch = entry.getValue().charAt(0);
	
	if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
		count++;
	}
}
System.out.println("Number of students having name starting with vowel :"+count);
}
	}

