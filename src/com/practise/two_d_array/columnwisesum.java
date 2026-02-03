package com.practise.two_d_array;

import java.util.Scanner;

public class columnwisesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many rows u want");
int r=sc.nextInt();
System.out.println("How many columns u want");
int c=sc.nextInt();
int [][] arr= new int [r][c];
System.out.println("Enter the numbers");

for ( int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		arr[i][j]=sc.nextInt();
		
	}
}

for (int i=0;i<c;i++) {
int sum=0;
	for(int j=0;j<r;j++) {
		sum+=arr[j][i];
		
	}
	System.out.println("Sum of column"+i+" : "+sum);
}
	}

}
