package com.practise.two_d_array;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int[][] arr = new int [3][3];
System.out.println("Enter the numbers");
for (int i=0;i<arr.length;i++) {
	for (int j=0;j<arr[i].length;j++) {
		arr[i][j]=sc.nextInt();
	}
}

for (int i=0;i<arr.length;i++) {
	int sum =0;
	for(int j=0;j<arr[i].length;j++) {
		sum+=arr[i][j];
		
	}
	System.out.println("Sum of "+(i+1)+"th row is :"+sum);
}
	}

}
