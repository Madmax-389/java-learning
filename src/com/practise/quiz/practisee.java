package com.practise.quiz;

import java.util.Scanner;


public class practisee {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many numbers you are gonna use");
int n = sc.nextInt();
int [] arr = new int[n];
System.out.println("Enter the numbers now");
for (int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
int max=0;
for (int i=0;i<arr.length;i++) {
	
	if(arr[i]>max) {
		max=arr[i];
	}
	
}
System.out.println("Max number is "+max);
	
	}}
