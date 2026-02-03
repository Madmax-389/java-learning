package com.practise.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class reverselookup {

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

System.out.println("Enter the student name");
String str=sc.nextLine().toLowerCase();

for (Map.Entry<Integer, String> entry : map.entrySet()) {
	if (str.equals(entry.getValue().toLowerCase())){
		System.out.println(entry.getKey());
	}
}
	}

}
