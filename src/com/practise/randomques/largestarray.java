package com.practise.randomques;

import java.util.Scanner;

public class largestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many number you want to enter in an array");
int n = sc.nextInt();
int arr[]= new int[n];
System.out.println("Enter the numbers now ");
for(int i =0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}

int max=arr[0];
for (int i =0;i<arr.length;i++) {
	
	if (arr[i]>max) {
		max=arr[i];
	}
}

System.out.println("The largest number is "+max);
	}

}
