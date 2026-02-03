package com.practise.strings;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter any sentence:");
String input = sc.nextLine();

// Convert to lowercase
System.out.println("Lowercase: " + input.toLowerCase());

// Check equality (== vs equals)
String str1 = "hello";
String str2 = new String("hello");
System.out.println("Using == : " + (str1 == str2));             // false
System.out.println("Using equals: " + str1.equals(str2));       // true

// Substring
if (input.length() >= 5) {
    System.out.println("Substring (0 to 5): " + input.substring(0, 5));
}

// Index of a character
System.out.println("Index of 'a': " + input.indexOf('a'));
System.out.println("Last Index of 'a': " + input.lastIndexOf('a'));

// Replace
System.out.println("Replace spaces with - : " + input.replace(" ", "-"));

// Trim
System.out.println("Trimmed string: '" + input.trim() + "'");
}
}