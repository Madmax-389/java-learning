package com.practise.quiz;

import java.util.Scanner;

public class newpractise {
	
	public static boolean prime(int n) {
		
		if(n<=0) {
			System.out.println("can not be a prime number as it is not positive");
			return false;
		}
		for (int i=2;i<n;i++) {
			if (n%i==0) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if (prime(n)==false) {
			System.out.println("It is not a prime number");
		}
		else {
			System.out.println("It is a prime number");
		}
		
	}
	
	
	

}
