package com.practise.two_d_array;

import java.util.Scanner;

public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter thenumber of rows ");
int row=sc.nextInt();
System.out.println("Enter thenumber of columns ");
int col=sc.nextInt();
int[][] arr = new int [row][col];
System.out.println("Enter the numbers ");
for (int i=0;i<row;i++) {
	for (int j=0;j<col;j++) {
		arr[i][j]=sc.nextInt();
	}
}
int [][] transpose = new int [col][row];
for (int i=0;i<row;i++) {
	for(int j=0;j<col;j++) {
		transpose[j][i]=arr[i][j];
		
	}
}
System.out.println("Transpose of matrix is :");
for (int i=0;i<col;i++) {
	for(int j=0;j<row;j++) {
System.out.print(transpose[i][j]+" ");
	}
	System.out.println(" ");
}
}}
