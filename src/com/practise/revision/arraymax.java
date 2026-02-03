package com.practise.revision;

import java.util.Scanner;

public class arraymax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many entries you want ");
int n = sc.nextInt();
int arr[]= new int[n];
System.out.println("Enter the numbers now ");
for (int i =0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}

int max = arr[0];
for (int i=1;i<arr.length;i++) {
	if (arr[i]>max) {
		max = arr[i];
	}
	
}
System.out.println("Max number of the array is "+max);
	}

}
