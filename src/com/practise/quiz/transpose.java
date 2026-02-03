package com.practise.quiz;

import java.util.Scanner;

public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("How many rows you want");
int r= sc.nextInt();
System.out.println("How many columns you want");
int c = sc.nextInt();
int [][] arr= new int [r][c];
System.out.println("Enter the numbers now");
for (int i=0;i<r;i++) {
	for (int j =0;j<c;j++) {
		arr[i][j]= sc.nextInt();
	}
}

int [][] transpose=new int[c][r];

for (int i=0;i<r;i++) {
	for (int j=0;j<c;j++) {
		transpose[j][i]=arr[i][j];
	}
}

for (int i=0;i<c;i++) {
	for (int j=0;j<r;j++) {
		System.out.print(transpose[i][j]+" ");
	}
	System.out.println(" ");
}

	}

}
