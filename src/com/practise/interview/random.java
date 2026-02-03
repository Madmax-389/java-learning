package com.practise.interview;

import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number"); 
int n=sc.nextInt();
int digit=0;
int sum=0;

while (n>0) {
	digit=n%10;
	sum=sum+ digit;
	n=n/10;
}

System.out.println("Sum of digits: "+sum);
	}

}
