package com.practise.two_d_array;

import java.util.Scanner;

public class allrowsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many rows you want");
int r=sc.nextInt();
System.out.println("How many columns you want");
int c =sc.nextInt();
int [][] arr= new int [r][c];
System.out.println("Enter the numbers now");
for (int i=0;i<r;i++) {
	for (int j=0;j<c;j++) {
		arr[i][j]= sc.nextInt();
	}
}

for (int i=0;i<r;i++) {
	for(int j=0;j<c-1;j++) {
		for (int k=0;k<c-1-j;k++) {
			if (arr[i][k]>arr[i][k+1]) {
				int temp=arr[i][k];
				arr[i][k]=arr[i][k+1];
				arr[i][k+1]=temp;
			}
		}
	}
}

System.out.println("Sorted array is : ");
for (int i=0;i<r;i++) {
	for (int j=0;j<c;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println(" ");
}
	}

}
