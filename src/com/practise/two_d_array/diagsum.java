package com.practise.two_d_array;

import java.util.Scanner;

public class diagsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows ");
int r=sc.nextInt();
System.out.println("Enter the number of columns");
int c = sc.nextInt();

if(!(r==c)) {
		System.out.println("It is not a square matrix");
	return;
}

int [][] arr = new int [r][c];
System.out.println("Enter the numbers");
for (int i=0;i<r;i++) {
	for (int j=0;j<c;j++) {
		arr[i][j]=sc.nextInt();
	}
}

int sum =0;

for (int i =0;i<r;i++) {
	for (int j=0;j<c;j++) {
		if (i==j) {
			sum+=arr[i][j];
	}
}
	

	}
System.out.println("Diagonal sum is : "+sum);

}}
