package com.practise.two_d_array;

import java.util.Scanner;

public class basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int[][]arr = new int[3][3];
System.out.println("Enter the numbers");
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		arr[i][j]=sc.nextInt();
	}
}
System.out.print("Row wise out put is : ");
for (int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println(" ");
}
	}
}
