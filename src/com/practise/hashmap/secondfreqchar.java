package com.practise.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class secondfreqchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string");
String str= sc.nextLine().toLowerCase();
HashMap <Character,Integer> map = new HashMap<>();
int max=0;
int secmax=0;

for (int i=0;i<str.length();i++) {
	char ch = str.charAt(i);
	map.put(ch, map.getOrDefault(ch, 0)+1);
}

for (int freq :map.values()) {
	if (freq>max) {
		secmax=max;
		max=freq;
	}
	else if(freq<max&&freq>secmax) {
		secmax=freq;
	}
}
boolean found = false ; 
System.out.println("second most frequesnt char(s) are :");
for (char key : map.keySet()) {
	if (map.get(key)==secmax) {
		System.out.println(key);
		found = true;
	}
}
if(!found) {
	System.out.println("No repetive chars are there");
}
}}
