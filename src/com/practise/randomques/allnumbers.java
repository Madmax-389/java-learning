package com.practise.randomques;

import java.util.Scanner;

public class allnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
for (int i =n;i>0;i--) {
	System.out.println(i);
}
sc.close();
	}

}
