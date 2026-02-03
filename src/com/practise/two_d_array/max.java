package com.practise.two_d_array;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows");
int r=sc.nextInt();
System.out.println("Enter the number of columns");
int c=sc.nextInt();
int [][] arr= new int [r][c];
System.out.println("enter the numbers now");
for (int i=0;i<r;i++) {
	for (int j=0;j<c;j++) {
		arr[i][j]=sc.nextInt();
	}
}
int max=arr[0][0];
int maxrow =0;
int maxcol=0;
for (int i=0;i<r;i++) {
	
	for (int j=0;j<c;j++) {
if (arr[i][j]>max) {
	max = arr[i][j];
	maxrow=i;
	maxcol=j;
}
	}
}
System.out.println("The maximum number is "+max+ " and it is found at "+" row :"+(maxrow+1)+" and column:  "+(maxcol+1));
}
}