package com.practise.revision;

import java.util.Scanner;

public class arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many numbers you r gonna enter");
int n = sc.nextInt();
if (n<=0){
	System.out.println("Number of elements can not be 0 or negative");
return;
}

int [] arr= new int[n];
System.out.println("Enter the numbers now");
for (int i =0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}

int sum=0;
for (int i=0;i<arr.length;i++) {
	sum =sum+arr[i];
}

System.out.println("The sum of all the numbers is "+sum);
	}

}
