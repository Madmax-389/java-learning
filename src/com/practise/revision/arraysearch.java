package com.practise.revision;

import java.util.Scanner;

public class arraysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many numbers u gonna enter");
int n = sc.nextInt();
if(n<=0) {
	System.out.println("n can not be 0 or negative");
	return;
}
int [] arr= new int[n];
System.out.println("Enter the numbers now");
for (int i =0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}

System.out.println("Enter the number u wanna search ");
int a=sc.nextInt();
for (int i=0;i<arr.length;i++) {
	if(a==arr[i]) {
		System.out.println("The desired number is at "+(i+1)+"th "+"position");
	}
}
	}

}
