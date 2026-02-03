package com.practise.two_d_array;

import java.util.Scanner;

public class allcolumnsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many rows u want");
int r = sc.nextInt();
System.out.println("How many columns you want ");
int c = sc.nextInt();
int [][] arr = new int [r][c];
System.out.println("Enter the numbers now ");
for (int i=0;i<r;i++) {
	for (int j=0;j<c;j++) {
		arr[i][j]= sc.nextInt();
		
	}
}

for (int j=0;j<c;j++) {
	for (int i=0;i<r-1;i++) {
		for (int k=0;k<r-1-i;k++) {
			if(arr[k][j]>arr[k+1][j]) {
				int temp= arr[k][j];
				arr[k][j]= arr[k+1][j];
				arr[k+1][j]= temp;
			}
		}
	}
}

System.out.println("Column wise sorted array is ");

for (int i=0;i<r;i++) {
	for (int j=0;j<c;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println(" ");
}
	}

}
