package com.practise.two_d_array;

import java.util.Scanner;

public class secdiagsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many rows you want");
int r = sc.nextInt();
System.out.println("How many columns you want");
int c = sc.nextInt();
int [][] arr = new int [r][c];
int n=r;
if(!(r==c)) {
	System.out.println("It is not a square matrix");
	return;
}
int sum=0;

System.out.println("Enter the numbers now");
for (int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		arr[i][j]= sc.nextInt();
	}
}
System.out.println("The numbers in sec diagonal are ");
for(int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		if (i+j==(n-1)) {
			System.out.print(arr[i][j]+" ");
			System.out.println(" ");
			
			sum+=arr[i][j];
		}
	}
}
System.out.println("Sum of sec diagnoal sum is "+sum);
	}

}
