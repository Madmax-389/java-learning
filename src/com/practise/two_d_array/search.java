package com.practise.two_d_array;

import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of rows");
int r = sc.nextInt();
System.out.println("Enter the number of columns");
int c = sc.nextInt();
int [][] arr = new int [r][c];
System.out.println("enter the numbers now ");
for (int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		arr[i][j] = sc.nextInt();
	}
}

System.out.println("Enter the number you wanna search ");
int n = sc.nextInt();
for (int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		if (n==arr[i][j] ) {
			System.out.println("The mentioned number is found at"+(i+1)+" row "+"and "+(j+1)+"column");
		}
	}
}
	}

}
