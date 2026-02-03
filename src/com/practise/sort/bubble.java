package com.practise.sort;

import java.util.Scanner;

public class bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many numbers u wanna enter");
int n = sc.nextInt();
int[]arr=new int[n];
System.out.println("Enter all the numbers");
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
	
}

for (int i=0;i<n-1;i++) {
	boolean swapped = false;
	for(int j=0;j<n-i-1;j++) {
		if(arr[j]>arr[j+1]) {
			int temp = arr[j];
			arr[j]= arr[j+1];
			arr[j+1]=temp;
			swapped = true;
			
		}
	}
	
	if(!swapped) { break;}
}
System.out.println("Sorted array is");
for  (int val:arr) {
	System.out.println(val+" ");
}
	}

}
