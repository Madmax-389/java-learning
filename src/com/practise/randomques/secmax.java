package com.practise.randomques;

import java.util.Scanner;

public class secmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number r u gonna use");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the numbers now");
		for (int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
int max =Integer.MIN_VALUE;
int secmax=Integer.MIN_VALUE;
for (int i=0;i<arr.length;i++) {
	

	
	if (arr[i]>max) {
		
		secmax=max;
		max =arr[i];
	}
	else if(arr[i]>secmax&&arr[i]!=max) {
		secmax=arr[i];
	}
	if (max==secmax) {
		System.out.println("No second max number. All are same ");
		return;
	}
	
}

System.out.println("Second max number is "+secmax);
	}

}
