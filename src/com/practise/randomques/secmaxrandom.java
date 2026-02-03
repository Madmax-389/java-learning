package com.practise.randomques;

import java.util.Scanner;

public class secmaxrandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("How many numbers u r gonna enter ");
int n= sc.nextInt();
int [] arr = new int [n];
System.out.println("You can enter the numbers now ");
for (int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}

int max =Integer.MIN_VALUE;
int secmax= Integer.MIN_VALUE;
int tmax=Integer.MIN_VALUE;
for (int i=0;i<arr.length;i++) {
	if (arr[i]>max) {
		tmax=secmax;
		secmax=max;
		max = arr[i];
	}
	
	else if (arr[i]<max && arr[i]>secmax) {
		secmax=arr[i];
	}
	
}

System.out.println("Second max valus is "+secmax);
	}

}
