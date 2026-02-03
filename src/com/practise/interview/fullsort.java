package com.practise.interview;

import java.util.Scanner;

public class fullsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many rows u want");
int r = sc.nextInt();
System.out.println("How many columns u want");
int c = sc.nextInt();
int [][] arr = new int [r][c];
System.out.println("Enter the numbers now ");
for (int i=0;i<r;i++) {
	for (int j=0;j<c;j++) {
		arr[i][j]= sc.nextInt();
		
	}
}

int [] flat =new int [r*c];
int index =0;
for (int i=0;i<r;i++) {
	for (int j=0;j<c;j++) {
		flat[index]=arr[i][j];
		index++;
	}
}

for (int i =0;i<(r*c)-1;i++){
	for (int j=0;j<(r*c)-1-i;j++) {
		if (flat[j]>flat[j+1]) {
			int temp=flat[j];
			flat[j]=flat[j+1];
			flat[j+1]=temp;
			
		}
		
	}
}
int [][] newarr= new int [r][c];
index=0;
for (int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		newarr[i][j]=flat[index];
		index++;
	}
}
System.out.println(" Sorted new array is ");
for (int i=0;i<r;i++) {
	for (int j=0;j<c;j++) {
		System.out.print(newarr[i][j]+" ");
	}
	System.out.println(" ");
}
	}

}
