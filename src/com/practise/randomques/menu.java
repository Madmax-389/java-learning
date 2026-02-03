package com.practise.randomques;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Select the option from below menu");
System.out.println("1.Print my name");
System.out.println("2.Print my age");
System.out.println("3.My football club");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
switch (a){
case 1 :
	System.out.println("Mohit Tiwari");
	break;
	
case 2 :
	
	System.out.println("25");
	break;
	
case 3 :
	
	System.out.println("Fc barcelona");
	break;	
}
	}

}
