package com.practise.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maxrepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String str1 = sc.nextLine();
HashMap<Character, Integer> map= new HashMap<>();
for (int i=0;i<str1.length();i++) {
	char ch= str1.charAt(i);
	map.put(ch, map.getOrDefault(ch, 0)+1);
}
int max=0;
char maxchar='\0';

for (Map.Entry<Character, Integer> entry: map.entrySet()) {
	if (entry.getValue()>max) {
		max = entry.getValue();
		 maxchar = entry.getKey();
	
	}
	
}

System.out.println("Max value is "+ max+"  and character is  "+maxchar);



	}

}
