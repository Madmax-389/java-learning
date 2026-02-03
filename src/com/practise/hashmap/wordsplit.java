package com.practise.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class wordsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the sentence");
String str=sc.nextLine().toLowerCase();
HashMap <String,Integer> map =new HashMap<>();
String[] words = str.split(" ");
for (String word : words) {
	map.put(word, map.getOrDefault(word, 0)+1);
	
}
System.out.println("Word frequencies : ");

for(String word : map.keySet()) {
	System.out.println(word+" -> "+map.get(word));
}
	}

}
